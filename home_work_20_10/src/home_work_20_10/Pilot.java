package home_work_20_10;

public class Pilot extends Person {
	private int seniority;
	private int licenseNum;

	//Constructor:
	public Pilot(String firstName, String lastName, int seniority, int licenseNum) {
		super(firstName, lastName);
		this.seniority = seniority;
		this.licenseNum = licenseNum;
	}

	//Getters + Setters:
	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public int getLicenseNum() {
		return licenseNum;
	}

	public void setLicenseNum(int licenseNum) {
		this.licenseNum = licenseNum;
	}
	
	//Printing Function:
	
	@Override
	public void printInfo() {
		super.printInfo(); 
		System.out.println("The pilot's flying seniority is: " + seniority + " years and his/her license number is: " + licenseNum + ".");
	}

}
