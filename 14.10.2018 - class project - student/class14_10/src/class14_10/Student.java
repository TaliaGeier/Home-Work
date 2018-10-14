package class14_10;

public class Student {
	private double grade;
	private double age;
	public static double ageCount=0;
	public static double gradeCount=0;
	public static double studentCount=0;
	
	
	
	public double getGrade() {
		return grade;
	}
	public double getAge() {
		return age;
	}
	public Student() {
		this.grade = Math.random() * 100;
		this.age = Math.random() * 60 + 18;
		ageCount += age;
		gradeCount += grade;
		studentCount++;
	}
	public static double avgGrade() {
		return gradeCount/studentCount;
	}
	
	public static double avgAge() {
		return ageCount/studentCount;
	}
	
}
