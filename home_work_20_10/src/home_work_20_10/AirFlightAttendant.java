package home_work_20_10;

public class AirFlightAttendant extends Person {
	private int seniority;
	private String countryOfOrigin;
	private String department;
	
	//Constructor:
	public AirFlightAttendant(String firstName, String lastName, int seniority, String countryOfOrigin,
			String department) {
		super(firstName, lastName);
		this.seniority = seniority;
		this.countryOfOrigin = countryOfOrigin;
		this.department = department;
	}
	//Getters + Setters:
	public int getSeniority() {
		return seniority;
	}
	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//Printing Function:
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("The flight attendant's  seniority is: " + seniority + " years, he/she is originally from: " + countryOfOrigin + " and they work in " + department + ".");
	}
	
}
