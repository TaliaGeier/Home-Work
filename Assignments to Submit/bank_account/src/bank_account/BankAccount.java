package bank_account;

public class BankAccount {

	// ATTRIBUTES
	private String accountName; // bank account owner
	private String accountNum; // the number of the account
	private double balance; // the balance of the account
	private boolean isOverDraftAllowed; // an indication whether an overdraft is allowed
	private double overDraftSum; // the overdraft amount allowed

	// DEFAULT CONSTRUCTOR
	public BankAccount() {
		this.accountName = "Account";
		this.accountNum = "000001";
		this.balance = 0;
		this.isOverDraftAllowed = false;
		this.overDraftSum = 0;
	}

	// CONSTRUCTOR

	public BankAccount(String accountName, String accountNum, double balance, boolean isOverDraftAllowed,
			double overDraftSum) {
		this.accountName = accountName;
		this.accountNum = accountNum;
		this.balance = balance;
		this.isOverDraftAllowed = isOverDraftAllowed;
		setOverDraftSum(overDraftSum);
	}

	// SETTERS & GETTERS
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isOverDraftAllowed() {
		return isOverDraftAllowed;
	}

	public void setOverDraftAllowed(boolean isOverDraftAllowed) {
		this.isOverDraftAllowed = isOverDraftAllowed;
		overDraftSum = (isOverDraftAllowed==false?0:overDraftSum);
	}

	public double getOverDraftSum() {
		return overDraftSum;
	}

	public void setOverDraftSum(double overDraftSum) {
		this.overDraftSum = (isOverDraftAllowed==true?overDraftSum:0);
		if(isOverDraftAllowed==false) {
			System.out.println("Overdraft isn't allowed for this account");
		}
	}

	// METHODS
	// method to make a deposit to the account
	public void makeDeposit(double deposit) {
		if (deposit > 0) {
			balance += deposit;
			System.out.println("Successful Deposit of " + deposit);
		} else {
			System.out.println("Error in deposit process");
		}
	}

	// method to make a withdrawal
	public double withdrawal(double withdrawal) {
		double finalWithdrawal = withdrawal;
		if (withdrawal <= 0) {
			// If withdrawal is either 0 or a negative number, request won't be granted.
			System.out.println("Error in withdrawal process");
			return finalWithdrawal = 0;
		}

		if (withdrawal <= balance) {
			// simple withdrawal
			balance -= withdrawal;
			System.out.println("Withdrawal Request Executed");
			
		// if requested withdrawal is larger than the balance:
		} else if (isOverDraftAllowed == true) {
			if (withdrawal <= (balance + overDraftSum)) {
				balance -= withdrawal;
				System.out.println("Withdrawal Request Executed");
			} else {
				// If overdraft is allowed, but insufficient
				finalWithdrawal = balance + overDraftSum;
				balance -= finalWithdrawal;
				System.out.println("Withdrawal Request Partially Executed");
			}
		} else {
			//(isOverDraftAllowed == false) 
			// if withdrawal is larger than balance and overdraft isn't allowed
			finalWithdrawal = balance;
			balance = 0;
			System.out.println("Withdrawal Request Partially Executed");
		} 
		System.out.println("Requested Withdrawal: " + withdrawal + " Granted Withdrawal: " + finalWithdrawal + "\nCurrent Balance: " + balance);
		return finalWithdrawal;
		
	}
	
	
	public void print () {
		System.out.println();
		if(isOverDraftAllowed==true) {
			System.out.println("Account Name: " + accountName + "\nAccount Number: " + accountNum + "\nBalance: " + balance + "\nAllowed Overdraft is: " + overDraftSum);
		}else {
		System.out.println("Account Name: " + accountName + "\nAccount Number: " + accountNum + "\nBalance: " + balance + "\nOverdraft isn't allowed");
	}
		System.out.println();
	}	
}
