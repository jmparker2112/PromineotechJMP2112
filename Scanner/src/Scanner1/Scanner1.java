package Scanner1;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		//This is the syntax for output
		System.out.println("What is your name?");
		
		//This is the syntax for input
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		System.out.println("Hello " + name);
		
	}

}
