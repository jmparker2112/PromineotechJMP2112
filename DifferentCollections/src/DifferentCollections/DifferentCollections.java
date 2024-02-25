package DifferentCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
		System.out.println(states.contains("Alabama"));
		
		if (states.contains("Alabama")) {
			states.remove("Alabama");
		}
		
		for (String state : states)	{
			System.out.println(state);
		}
		
		
		Set<String> vegetables = new HashSet<String>();
		
		vegetables.add("Carrot");
		System.out.println(vegetables);
		vegetables.add("Onion");
		System.out.println(vegetables);
		vegetables.add("Brocoli");
		System.out.println(vegetables);
		vegetables.add("Asparagus");
		System.out.println(vegetables);
		vegetables.add("Brocoli");
		System.out.println(vegetables);
		vegetables.add(null);
		System.out.println(vegetables);
		vegetables.add(null);
		System.out.println(vegetables);
		
		
		
		/*Map
		 * 
		 * Map(K, V) where K is the Key and V is the Value
		 * Key Value pairs like a dictionary
		 * Values can be duplicate, but not keys
		 * can have null values
		 * Common implementations included Hash Map, Linked Hash Map, HashTables, and TreeMap
		 * 
		 */
		
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Sally");
		racerPlacements.put(3, "John");
		
		System.out.println(racerPlacements.get(1));
		
		racerPlacements.remove(1);
		
		
		Set<Integer> racerKeys = racerPlacements.keySet();
		for (Integer key : racerKeys) {
			System.out.println(key + " : " + racerPlacements.get(key));
		}
		
		Collection<String> racers = racerPlacements.values();
		
		for (String racer : racers) {
			System.out.println(racer);
		}
 		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Augment", "make something greater; to increase");
		dictionary.put("Diminish", "make or become less");
		dictionary.put("ostentatious", "charachterized by vulgar or pretentious display");
		
//		for (String word : dictionary) {
//			System.out.println();
//		}
		
	}

}
