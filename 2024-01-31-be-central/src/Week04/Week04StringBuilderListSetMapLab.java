//Copyright (c) 2023 Promineo Tech
//Author:  Promineo Tech Academic Team
//Subject:  StringBuilders, Lists, Sets, & Maps
//Java Week 04 Lab  
//
package Week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// we would use a StringBuilder instead of a string as it mutable or better use of memory
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i <= 9; i++) {
			if (i < 9) {
				sb.append(i + "-");
			} else {
				sb.append(i);
			}
		}
		System.out.println(sb);
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length

		List<String>  guitars = new ArrayList<String>();
		guitars.add("Fender");
		guitars.add("Schecter");
		guitars.add("ESP");
		guitars.add("Epiphone");
		guitars.add("Rickenbacker");
		
		for (String guitar : guitars) {
			System.out.println(guitar);
		}
				
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string

		System.out.println("The Shortest String is : " + findShortestString(guitars));
		
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched

		swapStringElements(guitars, 0, (guitars.size() -1));
		for (String guitar : guitars) {
			System.out.println(guitar);
		}
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma

		System.out.println(catStrings(guitars));
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		
		System.out.println("--------------------------------------------------------");
		
		List<String> searchResults = search(guitars, "k");
		for (String result : searchResults) {
			System.out.println(result);
		}
			
		
		
	
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15); 
		
		List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);
		int count = 1;
		for (List<Integer> list : sortedNumbers) {
			for (Integer number : list) {
				System.out.println(number);
			}
			if (count < sortedNumbers.size()) {
				System.out.println("Next list ----------");
			}
			count++;
		}
		
				
		
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string

		System.out.println("-----------------------------------------");
		
		List<Integer> stringsLengths = getStringLength(guitars);
		for (Integer i : stringsLengths) {
			System.out.println(i);
		}

		
		// 9. Create a set of strings and add 5 values

		Set<String> setOfStrings = new HashSet<String>();
		setOfStrings.add("Hi");
		setOfStrings.add("Yo");
		setOfStrings.add("wassup!");
		setOfStrings.add("Greetings");
		setOfStrings.add("Later");
		for (String word : setOfStrings) {
			System.out.println(word);
		}
		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.

		Set<String> startsWithW = findStartWith(setOfStrings, 'w');
		for (String word : startsWithW) {
			System.out.println(word);
		}
		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		
		Set<String> aSet = new HashSet<String>();
		aSet.add("USA");
		aSet.add("Canada");
		aSet.add("Mexico");
		aSet.add("Guatemala");
		aSet.add("Honduras");
		aSet.add("Belize");
		aSet.add("Costa Rica");
		
		
		List<String> resultList = changeSetToList(aSet);
		
		for (String word : resultList) {
			System.out.println(word);
		}
		
		
		
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set

		Set<Integer> setIntegers = new HashSet<Integer>();
			setIntegers.add(1);
			setIntegers.add(2);
			setIntegers.add(599);
			setIntegers.add(42);
			setIntegers.add(60);
			setIntegers.add(13);
			
			Set<Integer> foundEvens = findEvens(setIntegers);
			for (Integer number : foundEvens) {
				System.out.println(number);
			}
		
			
		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word

		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Bodacious", "excellent, admirable, attractive");
		dictionary.put("Audacious", "extremely bold or daring, recklessly brave, fearless");
		dictionary.put("Courageous", "not deterred by danger or pain, brave");
		System.out.println(dictionary);
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		
		
		String result = findKeyResult(dictionary, "Courageous");
		System.out.println("Dictionary Result for 'Courageous': " + result);
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		
		Map<Character, Integer> counts = countStartingLetters(guitars);
		for (Character character : counts.keySet()) {
			System.out.println(character + " - " + counts.get(character));
		}


	}
	
	


	// Method 15:
	
	public static Map<Character, Integer> countStartingLetters(List<String> list) {
		Map<Character, Integer> results = new HashMap<Character, Integer>();

		for (String string : list) {
			char c = string.charAt(0);
			if (results.get(c) == null) {
				results.put(c, 1);
			} else {
				results.put(c, results.get(c) + 1);
			}
		}

		return results;
	}
	
	// Method 14:
	public static String findKeyResult(Map<String, String> map, String string) {
		for (String key : map.keySet()) {
			if (key.equals(string)) {
				return map.get(key);
			}
		}
		return "";
	}




	// Method 14:
	public static String findKeyResult(Map<String, String> map, String string) {
		for (String key : map.keySet()) {
			if (key.equals(string)) {
				return map.get(key);
			}
		}
		return "";
	}
	
	// Method 12:
	public static Set<Integer> findEvens(Set<Integer> set) {
		Set<Integer> results = new HashSet<Integer>();
		for (Integer number : set) {
			if (number % 2 == 0) {
				results.add(number);
			}
		}
		return results;
	}

	
	// Method 11:
	
	public static List<String> changeSetToList(Set<String> set) {
		List<String> someList = new ArrayList<String>();
		
		for (String string : set) {
			someList.add(string);
		}
		return someList;
	}

	// Method 10:
	
	public static Set<String> findStartWith(Set<String> set, char x) {
		Set<String> results = new HashSet<String>();

		for (String string : set) {
			if (string.charAt(0) == x) {
				results.add(string);
			}
		}

		return results;
	}
	
	// Method 8:
	
	public static List<Integer> getStringLength(List<String> list) {
		List<Integer> stringLengths = new ArrayList<Integer>(); 
		for (String item : list) {
			stringLengths.add(item.length());
		}
		return stringLengths;
	}

	
	// Method 7:
	
	public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());
		results.add(new ArrayList<Integer>());

		for (Integer number : list) {
			if (number % 2 == 0) {
				results.get(0).add(number);
			}
			if (number % 3 == 0) {
				results.get(1).add(number);
			}
			if (number % 5 == 0) {
				results.get(2).add(number);
			}
			if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
				results.get(3).add(number);
			}
		}

		return results;
	}
	
	// Method 6:
	
	private static List<String> search(List<String> list, String query) {
		List<String> results = new ArrayList<String>();	
		for (String string : list) {
			if (string.contains(query)) {
			results.add(string);		
		} 
		}
		return results;
	}

	
	// Method 5:
	
	public static StringBuilder catStrings(List<String> list) {
		StringBuilder catWord = new StringBuilder();
		for (String word : list) {
			catWord.append(word + ", ");
		}
		
		return catWord;
	}
	
	// Method 4:
	
	public static List<String> swapStringElements(List<String> list, int x, int y) {

		    String temp = list.get(x);
		    list.set(x, list.get(y));
		    list.set(y, temp);
		    return list;
		} 

		
	
	
	
	// Method 3:
	
	public static String findShortestString(List<String> list) {
		String shortest = list.get(0);
		for (String string : list) {
			if (string.length() < shortest.length()) {
				shortest = string;
			}
		} return shortest;
	}

}