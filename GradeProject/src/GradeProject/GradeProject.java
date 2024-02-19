package GradeProject;

public class GradeProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Mary";
		String lastName = "Brown";
		int assignmentOne = 100;
		int assignmentTwo = 79;
		int assignmentThree = 80;
		int assignmentFour = 90;
		int assignmentFive = 100;
		
		System.out.println("Student: " + firstName + " " + lastName);
		System.out.println("1: " + assignmentOne);
		System.out.println("2: " + assignmentOne);
		System.out.println("3: " + assignmentOne);
		System.out.println("4: " + assignmentOne);
		System.out.println("5: " + assignmentOne);
		
//		int[] gradesArray = new int[5];
		
//		int[] gradesArray;
//		gradesArray = new int [5];
		
		String fullName = "Mary" + " " + "Brown";
		int[] gradesArray = {100, 79, 80, 90, 100};
		System.out.println("Student: " + fullName);
		System.out.println("Grades: ");
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ": " + gradesArray[i]);
		}
		
		int counter = 1;
		for (int grade : gradesArray) {
			System.out.println(counter++ + ": " + grade);
			}
		
			
		
		
		
	}

}
