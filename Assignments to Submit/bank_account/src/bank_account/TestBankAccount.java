package bank_account;

public class TestBankAccount {

	public static void main(String[] args) {
		
		//Test 1
		BankAccount account1 = new BankAccount("Meirav", "123456", 10000, true, 500);

		account1.print();
		account1.makeDeposit(800);
		account1.print();

		account1.withdrawal(5000);
		account1.print();

		// Test 2
		BankAccount account2 = new BankAccount("Talia", "159847", 4500, false, 45654);
		account2.print();
		account2.withdrawal(9000);
		account2.print();

		//Test 3
		BankAccount account3 = new BankAccount("Maya", "1236789", 100, true, 50);
		account3.print();
		account3.withdrawal(130);
		account3.print();
		account3.makeDeposit(200);
		account3.print();
		account3.withdrawal(-55);
		account3.makeDeposit(-60);

		//Test 4
		BankAccount account4 = new BankAccount("Dan", "4592365", 100, true, 50);
		account4.print();
		account4.withdrawal(160);
		account4.print();
		account4.withdrawal(-10);
		account4.makeDeposit(-98);
		account4.print();
		account4.makeDeposit(80000);
		account4.print();

	}

}
