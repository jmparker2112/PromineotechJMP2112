package WhiteBoard;

public class WhiteBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] grades = { 100, 100, 100 };
		
//		String Student = "";
		
		Student student1 = new Student("Molly Mack", grades);
		Student student2 = new Student("Molly Mack", grades);
		
		
		
		System.out.println("student1 vs. student2 Equality Example:");
		System.out.println("---------------------------------------");
		System.out.println("Is student1 == student2? " 
		                    + (student1 == student2));
		System.out.println("Is student1.equals(student2)? " 
		                    + (student1.equals(student2)));
		System.out.println("Is student1.equals(\"Molly Mack\")? " 
		                    + (student1.equals("Molly Mack")));
		System.out.println("Is student1.fullName.equals(\"Molly Mack\")? " 
		                    + (student1.fullName.equals("Molly Mack")));
		
		
		
		
	}

}
