package task;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

public class Program {

	public static void main(String[] args) {
		
		// Hashtable where the key is the person's name and the value
		// is a queue of tasks
		Hashtable<String, Queue<Task>> ToDoList = new Hashtable<>();
		
		// Bob
		Queue<Task> bobsTasks = new LinkedList<>(); // creating Bob's Queue
		
		// creating his tasks separately
		Task<String> t1 = new Task<String>("Buy Food", 20);
		Task<String[]> t2 = new Task<>(new String[]{"Clean Room", "Clean Garden"}, 50);
		
		// adding his tasks to his Queue
		bobsTasks.add(t1);
		bobsTasks.add(t2);
		
		// adding his Queue to the Hashtable
		ToDoList.put("Bob", bobsTasks);
		
		// Alice
		Queue<Task> alicesTasks = new LinkedList<>(); // creating Alice's Queue
		
		// creating her tasks separately
		Task<String> t3 = new Task<String>("Cook Food", 20);
		Task<String[][]> t4 = new Task<>(new String[][] {{"Buy Drink", "Buy Food"}, {"Pay to Post", "Pay to Bank"}}, 120);
	
		// adding her tasks to his Queue
		alicesTasks.add(t3);
		alicesTasks.add(t4);
		
		// adding her Queue to the Hashtable
		ToDoList.put("Alice", alicesTasks);
		
		
		
		
		// Method to print the info
		for(String key: ToDoList.keySet()) {
			int totalDuration = 0;
			System.out.println(key+"'s Tasks are: ");
				
			Queue<Task> Q =  ToDoList.get(key);
			for(Task t: Q) {
				totalDuration += t.taskDuration;
				
			}
			System.out.println("Their tasks are: " + totalDuration + " mins long");
			
			
				
			
			
			
		}
		
		 
		
	}



}
