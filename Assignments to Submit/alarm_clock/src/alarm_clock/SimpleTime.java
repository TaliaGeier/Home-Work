package alarm_clock;

public class SimpleTime {
	
	//ATTRIBUTES
	protected int hour;
	protected int minute;
	protected int second;
	
	//DEFAULT CONSTRUCTOR
	public SimpleTime() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
		
		
	}
	//CONSTRUCTOR
	public SimpleTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	//SETTERS & GETTERS
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = ((hour<=23 && hour>=0)?hour:0);
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = ((minute<=59 && minute>=0)?minute:0);
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = ((second<=59 && second>=0)?second:0);
	}
	
	// METHODS
	
	// Method to set the time
	public void setTime (int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	//Method to increase the value of hour
	public void addHour (int hoursToAdd) {
		hour += hoursToAdd;
		hour = (hour>23?hour%24:hour);
		}
	
	//Method to increase the value of minute
	public void addMinute (int minutesToAdd) {
		minute += minutesToAdd;
		if(minute>59) { // verify that if the total number of minutes exceeds 60, "hour" will be updated accordingly
		addHour((int)minute/60);
		minute = minute%60; 
		}
	}
	//Method to increase the value of second
	public void addSecond (int secondsToAdd) {
		second += secondsToAdd;
		if(second>59) { // verify that if the total number of seconds exceeds 60, "minute" will be updated accordingly
		addMinute((int)second/60);
		second = second%60; 
		}
	}
	// Method to add one second to the clock
	public void tick () {
		addSecond(1); 
	}
	
	//Method used to add SimpleTime to SimpleTime
	public void add (SimpleTime addSimpleTime) {
		addHour(addSimpleTime.getHour());
		addMinute(addSimpleTime.getMinute());
		addSecond(addSimpleTime.getSecond());

	}
	
	// Method to compare two time objects and check whether they're the same
	public boolean equals(SimpleTime compSimpleTime) {
		
		return hour==compSimpleTime.hour && minute == compSimpleTime.minute && second == compSimpleTime.second;
	}
	
	// Method to print the time in the correct format
	@Override
	public String toString() {
	
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	
}
