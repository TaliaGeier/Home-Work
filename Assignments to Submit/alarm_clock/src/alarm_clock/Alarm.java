package alarm_clock;

public class Alarm {
	
	// ATTRIBUTES
	private SimpleTime time;
	private boolean isSet; // defines whether the alarm is on or off
	private int snoozeTime; // minutes until next alarm
	private boolean isSnooze; // defines whether snooze is enabled
	
	// DEFAULT CONSTRUCTOR
	public Alarm() {
		this.time = new SimpleTime();
		this.isSet = false;
		this.snoozeTime = 0;
		this.isSnooze = false;
	}
	// CONSTRUCTOR
	public Alarm(SimpleTime time, boolean isSet, int snoozeTime, boolean isSnooze) {
		this.time = new SimpleTime(time.getHour(), time.getMinute(), time.getSecond());
		this.isSet = isSet;
		this.snoozeTime = snoozeTime;
		this.isSnooze = isSnooze;
	}
	
	//SETTERS & GETTERS
	public SimpleTime getTime() {
		return time;
	}
	public void setTime(SimpleTime time) {
		this.time = time;
	}
	public boolean isSet() {
		return isSet;
	}
	public void setSet(boolean isSet) {
		this.isSet = isSet;
	}
	public int getSnoozeTime() {
		return snoozeTime;
	}
	public void setSnoozeTime(int snoozeTime) {
		this.snoozeTime = snoozeTime;
	}
	public boolean isSnooze() {
		return isSnooze;
	}
	public void setSnooze(boolean isSnooze) {
		this.isSnooze = isSnooze;
	}
	

	
	
	

}
