package home_work_20_10;

public class Passenger extends Person {
	private int passportNum;

	// Constructor:
	public Passenger(String firstName, String lastName, int passportNum) {
		super(firstName, lastName);
		this.passportNum = passportNum;
	}

	// Getters + Setters:
	public int getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(int passportNum) {
		this.passportNum = passportNum;
	}

	// Printing Function:
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("The passenger's passport number is: " + passportNum + ".");
	}

}
