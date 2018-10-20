package home_work_20_10;

public class DaleLand extends Person {
	private int seniority;
	private String countryOfOrigin;
	private String role;
	
	//Constructor:
	public DaleLand(String firstName, String lastName, int seniority, String countryOfOrigin, String role) {
		super(firstName, lastName);
		this.seniority = seniority;
		this.countryOfOrigin = countryOfOrigin;
		this.role = role;
		
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	//Printing Function:
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("The dale land's seniority is: " + seniority + " years, he/she is originally from: " + countryOfOrigin + " and their role is: " + role + ".");
	}

}
