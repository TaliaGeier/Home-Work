package class14_10;

public class Program {

	public static void main(String[] args) {
		Student[] student = new Student [4];
		student[0] = new Student();
		student[1] = new Student();
		student[2] = new Student();
		student[3] = new Student();
		
		for (Student tempStudent: student) {
			System.out.println("age: " + tempStudent.getAge() + " grade: " + tempStudent.getGrade());
		}
		
		System.out.println("the average age is: " + Student.avgAge() + "\nthe average grade is: " + Student.avgGrade());
	}
}
