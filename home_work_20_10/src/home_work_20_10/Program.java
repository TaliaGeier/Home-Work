package home_work_20_10;

public class Program {

	public static void main(String[] args) {
		Person[] flightpeople = new Person [4];
		
		flightpeople[0] = new Pilot("Jon", "Smith", 10, 12345);
		flightpeople[1] = new AirFlightAttendant("Lisa", "Cohen", 4, "Spain", "Business");
		flightpeople[2] = new DaleLand("Harry", "Gold", 2, "New York", "Check-in desk attendant");
		flightpeople[3] = new Passenger("Daniel", "Akana", 789456123);
		
		for(Person p: flightpeople) {
			p.printInfo();
		}
				
	}

}
