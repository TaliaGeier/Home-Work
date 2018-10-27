package alarm_clock;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		//setting the current time
		System.out.println("Please set current time(using this format HH:MM:SS): "); // asking the user to set the time in String format
		String timestr = scan.nextLine(); // using a temporary variable to save the time the user entered - timestr
		String[] parts = timestr.split(":"); // using the split function to cut the string into hour, minute and second
		AlarmClock myAlarmClock = new AlarmClock(); // creating a new alarm clock, as instructed
		myAlarmClock.setCurrentTime(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2])); // turning the string the user entered into integers and using them to create the current time
		
		//creating the first alarm
		System.out.println("Please set the first alarm(using this format HH:MM:SS): "); // asking the user to set the first alarm in String format
		String firstalarm = scan.nextLine(); // using a temporary variable to save the first alarm the user entered - firstalarm
		String[] parts1 = firstalarm.split(":"); // using the split function to cut the string into hour, minute and second
		myAlarmClock.setAlarm(1, Integer.parseInt(parts1[0]), Integer.parseInt(parts1[1]), Integer.parseInt(parts1[2]), true, 5, true);//turning the string the user entered into integers and using them in the constructor to create a new alarm
		
		//creating the second alarm
		System.out.println("Please set the second alarm(using this format HH:MM:SS): "); // asking the user to set the second alarm in String format
		String secondalarm = scan.nextLine(); // using a temporary variable to save the second alarm the user entered - secondalarm
		String[] parts2 = secondalarm.split(":"); // using the split function to cut the string into hour, minute and second
		myAlarmClock.setAlarm(2, Integer.parseInt(parts2[0]), Integer.parseInt(parts2[1]), Integer.parseInt(parts2[2]), true, 14, true);//turning the string the user entered into integers and using them in the constructor to create a new alarm
	
		// Activating alarm clock
		myAlarmClock.tick();
		scan.close();
	}
}
