package UserInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean loggedIn = false;
		
		Scanner sc= new Scanner(System.in);    
		int loginAttempts = 0;
		
		
		while (!loggedIn && loginAttempts < 5) {
			System.out.print("Enter username: ");   
			String username = sc.nextLine();   
			System.out.print("Enter password: ");  
			String password = sc.nextLine();   
			if (username.equals("samy123") && password.equals("12345")) {
					System.out.println("Welcome back " + username);
					loggedIn = true;
		    } else { 
		    	System.out.println("Inaccurate credentials!");
		    	loginAttempts++;
		    } // end of else 
		} // end of while
	}

}
