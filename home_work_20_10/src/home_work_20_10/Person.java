package home_work_20_10;

public abstract class Person {
	private String firstName;
	private String lastName;
	
	//Constructor:
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//Getters + Setters:
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//Print Function:
	
	public void printInfo () {
		System.out.println("Person: " + lastName + ", " + firstName);
	}
	

}
