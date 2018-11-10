package task;

import java.util.Arrays;

public class Task <T>{
	public T taskContent; // what the task is
	public int taskDuration;// time in mins it takes to perform task
	
	
	// constructor
	public Task(T content, int taskDuration) {
		this.taskContent = taskContent;
		this.taskDuration = taskDuration;
	}
	
	
	
@Override
public String toString() {
	return (String) taskContent;
}
	

}
