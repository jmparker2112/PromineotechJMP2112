package Conditionals;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double costOfEggs = 4.12;

		int numberOfDozensOfEggsToPurchase = 0;

		if (costOfEggs > 3) {

		  numberOfDozensOfEggsToPurchase = 1;

		} else if (costOfEggs > 2) {

		  numberOfDozensOfEggsToPurchase = 2;

		} else if (costOfEggs > 1) {

		  numberOfDozensOfEggsToPurchase = 3;

		} else {

		  numberOfDozensOfEggsToPurchase = 4;

		}

		System.out.println("I will buy " + numberOfDozensOfEggsToPurchase + " dozen eggs.");

		
		
		
		char grade = 'D';

		switch (grade) {

		    case 'A':

		        System.out.println("90-100");

		        break;

		    case 'B':

		        System.out.println("80-89");

		        break;

		    case 'C':

		        System.out.println("70-79");

		        break;

		    case 'D':

		        System.out.println("60-69");

		        break;

		    default:

		        System.out.println("0-59");

		}
		
	}

}
