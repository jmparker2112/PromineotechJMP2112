package WhiteBoard;

import java.util.HashSet;
import java.util.Set;

public class WhiteBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String lastName = "";
		if (lastName.isEmpty()) {
			System.out.println("Please enter all of the required information.");
		} 
		
		
		StringBuilder item1 = new StringBuilder("Bananas");
		StringBuilder item2 = new StringBuilder("Tomato Soup");
		StringBuilder item3 = new StringBuilder("Apples");
		StringBuilder item4 = new StringBuilder("Bread");
		Set<String> myGroceryList = new HashSet<>();

		myGroceryList.add("item1");

		myGroceryList.add("Item2");

		myGroceryList.add("Item3");

		myGroceryList.add("Item4");
		
		System.out.println(myGroceryList);
		
		
//		int[] grades = { 100, 100, 100 };
//		
////		String Student = "";
//		
//		Student student1 = new Student("Molly Mack", grades);
//		Student student2 = new Student("Molly Mack", grades);
//		
//		
//		
//		System.out.println("student1 vs. student2 Equality Example:");
//		System.out.println("---------------------------------------");
//		System.out.println("Is student1 == student2? " 
//		                    + (student1 == student2));
//		System.out.println("Is student1.equals(student2)? " 
//		                    + (student1.equals(student2)));
//		System.out.println("Is student1.equals(\"Molly Mack\")? " 
//		                    + (student1.equals("Molly Mack")));
//		System.out.println("Is student1.fullName.equals(\"Molly Mack\")? " 
//		                    + (student1.fullName.equals("Molly Mack")));
//		
//		
//		
		
	}

}
