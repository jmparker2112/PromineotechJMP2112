package DifferentCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferentCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*List
		 * 
		 * Allows Duplicates
		 * Keeps elements ordered by index
		 * allows null values
		 * Common Implementations are ArrayLists, Linked Lists, and Vector
		 * 
		 */
		
		List<String> students = new ArrayList<String>();
		students.add("Rob");
		students.add("Rob");
		students.add("Sam");
		students.add(null);
		
		for (String student : students) {
			System.out.println(student);
		}
		
		System.out.println(students.get(2));
		System.out.println(students.get(0));
		
		/*Set
		 * 
		 * Does not allow duplicates
		 * Unordered
		 * allows null
		 * Common Implementations include HashSet, Linked HashSet, and Tree Set
		 * 
		 */
		Set<String> states = new HashSet<String>();
		
		states.add("Alabama");
//		states.add("Alabama");
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansas");
		states.add("California");
		states.add(null);



		System.out.println(states.size());
		
		for (String state : states)	{
			System.out.println(state);
		}
		
		
		
		
		//Map
		
	}

}
