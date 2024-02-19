//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package Week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		
		int[] myArray = {1, 5, 2, 8, 13, 6};
		
		
		// 2. Print out the first element in the array

		System.out.println(myArray[0]);
		
		// 3. Print out the last element in the array without using the number 5
		
		System.out.println(myArray[myArray.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?

//		System.out.print(myArray[6]);
		
		// 5. Print out the element in the array at position -1, what happens?

//		System.out.println(myArray[-1]);
			
		// 6. Write a traditional for loop that prints out each element in the array
	
		for (int i = 0; i < myArray.length;  i++) {
			System.out.println(myArray[i]);
		}
		
		// 7. Write an enhanced for loop that prints out each element in the array

		for (int number : myArray) {
			System.out.println(number);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum

		double sum = 0;
		
		for (int number : myArray) {
			sum += number;
		}
			System.out.println(sum);
					
		// 9. Create a new variable called average and assign the average value of the array to it

		double average = sum / myArray.length; 
		System.out.println("Average: " + average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd

		for (int num : myArray) {
			if (num % 2 != 0) {
				System.out.println(num);
			} 
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"

		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		
		
		// 12. Calculate the sum of all the letters in the new array

		int namesSumLength = 0;
		for (String name : names) {
			namesSumLength += name.length();
		}
		System.out.println("Sum of the length of all names in array: " + namesSumLength);
		
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		for (String name : names) {
			greet(name);
		}
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.

		System.out.println(greet2("Adrianne"));
		
		// or 
		
		String greetRocky = greet2("Adrianne");
		System.out.println(greetRocky);
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		// 13 can only be used as a method to return an output. 
		// 14 can be stored as a string 
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		//isStringLongerThanNumber("Jason", 3);
		System.out.println(isStringLongerThanNumber("Jason", 3));
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		System.out.println(compareString(names, "Sam"));
		
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	
		System.out.println(findSmallestNumber(myArray));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		
		double doubleArray[] = {3.2, 5.1, 6.7, 4.4}; 
		
		System.out.println(returnAverage(doubleArray));
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position

		int[] nameLengths = extractStringLengths(names);
			for (int number : nameLengths) {
				System.out.println(number);
			}
		
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

		System.out.println(placeHolder(names));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		System.out.println(isPalindrome("bogus"));
		
	}
	

	
	// Method 13:
	public static void greet (String name) {
		System.out.println("Hello " + name + "."); 
	}

	// Method 14:
	
	public static String greet2 (String name) {
		return "Yo " + name + "!";
	}

	
	// Method 15:

//	public static void isStringLongerThanNumber (String x, int y) {
//		if (x.length() > y) {
//			System.out.println(x == x);
//		}
//	}
	
	public static boolean isStringLongerThanNumber(String x, int y) {
		return (x.length() > y);
		}
	
	// Method 16:

	public static boolean compareString(String[] array, String string) {
		for (String str : array ) {
			if (str.equals(string)) {
				return true;
			} 
		}
			return false;
	}
	
	// Method 17:

	public static int findSmallestNumber(int[] numbers) {
		int smallest = numbers[0];
			for (int number : numbers) {
				if (number < smallest) {
					smallest = number;
				}
		}
			return smallest;
	}
	
	// Method 18:

	public static double returnAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number; 
		} 
		return sum / array.length;
} 
	
	// Method 19:

	public static int[] extractStringLengths(String[] strings) {
		int[] results = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results;
	}
	
	// Method 20:
	
	public static boolean placeHolder(String[] array) {
		int sumOfEvens = 0;
		int sumOfOdds = 0;
		
		for (String string : array) {
//		for (int i = 0; i < array.length; i++) {
			if (string.length() % 2 == 0) {
				sumOfEvens += string.length();
			} else {
				sumOfOdds += string.length(); 
			 }
		}
		 return (sumOfEvens > sumOfOdds);
		
	}


	// Method 21:
	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
	
	
}
