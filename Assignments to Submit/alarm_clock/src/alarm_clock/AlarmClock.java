package alarm_clock;

public class AlarmClock {
	// ATTRIBUTES
	private ExtendedTime currentTime; // represents the current time
	Alarm[] alarmTime = new Alarm[5]; // array of five alarms

	// DEFAULT CONSTRUCTOR
	// Creation of all objects and setting them to their default state
	public AlarmClock() {
		this.currentTime = new ExtendedTime();
		for (int i = 0; i < alarmTime.length; i++) {
			this.alarmTime[i] = new Alarm();
		}
	}
	// SETTER & GETTER

	public void setCurrentTime(int hour, int minute, int second) {
		this.currentTime.setHour(hour);
		this.currentTime.setMinute(minute);
		this.currentTime.setSecond(second);
	}

	public ExtendedTime getCurrentTime() {
		return currentTime;
	}

	// METHODS
	// Method to set the attributes of one of the 5 alarms
	public void setAlarm(int alarmIndex, SimpleTime time, boolean isSet, int snoozeTime, boolean isSnooze) {
		alarmIndex = ((alarmIndex >= 1 && alarmIndex <= 5) ? alarmIndex : 0);
		alarmTime[alarmIndex - 1] = new Alarm(time, isSet, snoozeTime, isSnooze);
	}

	// Method similar to the last, with a different way to set the time of the alarm
	// - manually
	public void setAlarm(int alarmIndex, int hour, int minute, int second, boolean isSet, int snoozeTime,
			boolean isSnooze) {
		SimpleTime tempSimpleTime = new SimpleTime(hour, minute, second);
		setAlarm(alarmIndex, tempSimpleTime, isSet, snoozeTime, isSnooze);
	}

	// Method to use the "tick" method in SimpleTime to add one second to the clock,
	// print the new time and check whether there's an alarm set for that time
	public void tick() {
		// creating a temporary object of type ExtendedTime so we can check the snooze
		// time against current time 
		ExtendedTime tempTime = new ExtendedTime();
		int numOfSecondsInADay = 86400; // the number of seconds in a day
		for (int j = 0; j < numOfSecondsInADay; j++) { // a simulation of a 24-hour run

			currentTime.tick();// time is advancing one second at a time
//			S ystem.out.println(currentTime.toString());// prints current time

			for (int i = 0; i < alarmTime.length; i++) {
				// scanning the array of alarms to check whether the alarm is on AND if it
				// equals the current time
				if (alarmTime[i].isSet() == true && alarmTime[i].getTime().equals(currentTime)) {
					System.out.println("RING RING RING " + currentTime.toString());

					// if the alarm is on AND snooze is on AND alarm time+snooze minutes=current
					// time, then ring
				} else if (alarmTime[i].isSet() == true && alarmTime[i].isSnooze() == true) {
					tempTime.setTime(alarmTime[i].getTime().getHour(), alarmTime[i].getTime().getMinute() ,alarmTime[i].getTime().getSecond());
					tempTime.addMinute(alarmTime[i].getSnoozeTime());
					if (tempTime.equals(currentTime)) {
						System.out.println("RING RING RING " + currentTime.toString() + " - snooze");
					}
				}

			}
		}

	}
}
