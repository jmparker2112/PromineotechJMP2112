package Week04CodingProject;

public class Week04CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// here we are declaring an array of integers named ages	
		//Week04 Coding Project
		//1 a
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		// simple math operation to subtract the first array item from the last and then print the result 
		int result = ages[ages.length -1] - ages[0];
		System.out.println(result);
		
		//1b
		//here is a new array of integers called ages2 and we double check that the length is 9
		int[] ages2 = {11, 14, 25, 36, 44, 58, 70, 84, 90};
		System.out.println("The length of the ages2 array is: " + ages2.length);
		//subtract the first array item from the last and display the result
		int result2 = ages2[ages2.length -1] - ages2[0];
		System.out.println(result2);
		
		//show that using the index value of an array is dynamic and works for different length arrays
		System.out.println(ages[ages.length - 1]);	
		System.out.println(ages2[ages2.length - 1]);
		System.out.println(ages[3]);
		System.out.println(ages2[3]);
		
		
		//1c
		//we are using a for loop to iterate through the array and to then calculate the average age
		int sum = 0;
		for (int age : ages) {
			sum+= age;
		} 
		int average = 0;
		average = (sum / ages.length);
		System.out.println("The average age of the items in ages array is: " + average);

	
		//2
		//Create an array of String 
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//2a 
		//create a loop to iterate through this array and calculate the average number of letters in each
		double averageLetters = 0;
		double sumLetters = 0;

		for (String name : names) {
			sumLetters += name.length();
			}
		averageLetters = sumLetters / names.length;
		System.out.println("The Average of the length of all names in array: " + averageLetters);
		
		//2b
		//use a loop to itereate through the Array and concatenate all of the strings together
		StringBuilder catWord = new StringBuilder();
		for (String name : names) {
			catWord.append(name);
		}
		System.out.println(catWord);
		
		//3
		// here is how we access the last item in an array
		System.out.println(names[names.length - 1]);
		
		//4
		//Here is how we access the first item of an array
		System.out.println(names[0]);
		
		//5 create a new Array of int called nameLengths
		int temp = 0;

		//Write a loop to iterate over the array names and get the lengths of each element, then add those
		// to the new array nameLengths
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			temp = names[i].length();
			nameLengths[i] = temp;
		}
		
		//6
		//here is a loop to iterate over the nameLengths Array and calculate the sum of all the 
		// elements in the Array. We then print the result to the console
		int lengthSum = 0;
		for (int x : nameLengths) {
			lengthSum += x;
		}
		System.out.println(lengthSum);
		
		//7
		//this uses the method multiplyWord to take the given String and concatenate it to itsel
		// n number of times
		String myWord = multiplyWord("Hello", 4);
		System.out.println(myWord);
		
		//8
		// write a method that takes two Strings, firstname and lastname, and returns a String of Fullname
		// separated by a space
		String myName = makeName("John", "Smith");
		System.out.println(myName);
		
		//9
		//Here is a method that takes an Array of int and returns true if the sum of all the ints in the Array
		//is greater than 100.
		
		System.out.println(isTrue(ages));
		
		//10
		// we are going to make an array of type double. we are then going to create a method that
		//returns the average of that array
		double[] groceryBill = {4.50, 5.00, 9.95, 11.35, 1.85};
		double averageItemPrice = (averageBill(groceryBill));
		System.out.println("The average grocery item cost is: " + averageItemPrice);
		
		
		//11
		// we create a second array of type double, find the average, and then return true if the first array average is higher than the second
		double[] secondGroceryTrip = {45.95, 19.99, 0.99};
		double averageItemPrice2 = (averageBill(secondGroceryTrip));
		System.out.println("The average item price in my second grocery trip is: " + averageItemPrice2);
		boolean priceCheck = isHigher(averageItemPrice, averageItemPrice2);
		System.out.println("The average item price in the first trip was higher than the second: " + priceCheck);
		
		//12
		// This one checks to see if it is hot outside and that you have more than $10.50. If these 
		//conditions are met, return true, otherwise return false. 
		boolean buydrink;
		System.out.println(willBuyDrink(true, 11.00));
	
		//13
		// we are going to write a two array of type double here for the save percentage of two top goalies for the past five games
		// we are then going to calculate the average save percentage for the past five games
		// we are then going to compare the two and return true if Connor Hellebuyck was the better goalie
		
		double[] lastFiveSavePercentageCH = {.848, .943, .906, .914, .914};
		double lastFiveSaveAverageCH = averageSavePercentage(lastFiveSavePercentageCH);
		System.out.println("Connor Hellebuyck's save percentage of the last five games is: " + lastFiveSaveAverageCH);
		double[] lastFiveSavePercentageAH = {.893, .897, .850, .933, .844};
		boolean goalieComparison = goalieComparison(lastFiveSavePercentageCH, lastFiveSavePercentageAH);
		double lastFiveSaveAverageAH = averageSavePercentage(lastFiveSavePercentageAH);
		System.out.println("Adin Hill's save percentage of the last five games is: " + lastFiveSaveAverageAH);
		System.out.println("Connor Hellebuyck has outperformed Adin Hill in the past five games: " + goalieComparison);
	
}
	
	//	METHODS----------------------------------------------------------------------------------------
	// 13 method for item 13
		public static double averageSavePercentage(double[] someArray) {
			double mySum=0;
			for (double stat : someArray) {
				mySum += stat;
			} return (mySum / someArray.length);
		}
	
		public static boolean goalieComparison(double[] someArray, double[] anotherArray) {
			double sum1 = 0.00;
			double sum2 = 0.00;
			double average1 = 0.00;
			double average2 = 0.00;
			for (double stat1 : someArray) {
				sum1 += stat1;
			} average1 = (sum1 / someArray.length);

			for (double stat2 : anotherArray) {
				sum2 += stat2;
			} average2 = (sum2 / anotherArray.length);
			return (average1 > average2);
}


		// here is the method for step 12
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if ((isHotOutside == true) && (moneyInPocket > 10.50)) {
				return true;
			} else return false;
		}
		
	
		// here is the method for step 11
		public static boolean isHigher(double x, double y) {
			return (x > y);
		}
	
		// here is the method for step 10
		public static double averageBill(double[] anArray) {
			double mySum=0;
			for (double stat : anArray) {
				mySum += stat;
			} return (mySum / anArray.length);
		}
	
	
	    // here is the method for step 9
		public static boolean isTrue(int[] someArray) {
			int mySum = 0;
			for (int item : someArray) {
				mySum += item;
			} 
			if (mySum > 100) {
				return true;
			} else {
				return false;
			}

		}
	
	// here is the method for step 8
		public static String makeName(String firstName, String lastName) {
			String fullName = (firstName + " " + lastName);
			return fullName;
		}
	
		//here is the method for step 7
		public static String multiplyWord(String word, int n) {
			String placeHolder = "";
			for (int i = 0; i < n; i++) {
				placeHolder += word;
		}			return placeHolder;
}
}