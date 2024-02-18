package Variables;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Variable declaration - type, identifier(name), assignment/operator, semicolon
		 * 
		 * Naming convention for variables follows camelCase, meaning the first word in a name 
		 * starts with lower case character and every subsequent word in the name starts with an 
		 * Upper case character.
		 *
		 *       [type] [identifier(name)] [assignment]/[operator] [semicolon]
		 *       Example:  int age = 25;
		 * 
		 * -----------------------------------------------------
		 * 2 types of variables: Primitives and Objects
		 * 
		 * 8 Primitive Data Types:
	 	 * 
	 	 * byte  -  8-bit integer, Range = -127 to 128
	 	 * short - 16-bit integer, Range = -32,768 to 32,767
	 	 * 
	 	 * int   - 32-bit integer, Range = -2(to the power of 31) to 2(to the power of 31)-1
	 	 * long  - 64-bit integer, Range = -2(to the power of 63) to 2(to the power of 63)-1
	 	 * 
	 	 * float  - 32-bit floating point with a decimal
	 	 * double - 64-bit floating point with a decimal
	 	 * 
	 	 * boolean - true/false
	 	 * char    - Single 16-bit character (e.g., a, B, c, G)
	 	 * 
	 	 * -----------------------------------------------------
	 	 * Objects:
	 	 * String - is textual data, a string of characters
	 	 * 
	 	 * -----------------------------------------------------
	 	 * 
	 	 * Default values
	 	 * The following chart summarizes the default values for the above data types.
	 	 * 
	 	 * Data Type	Default Value (for fields)
	 	 * byte	    	0
	 	 * short		0
	 	 * int	    	0
	 	 * long	    	0L
	 	 * float		0.0f
	 	 * double		0.0d
	 	 * char	    	'\u0000' (or 0)
	 	 * boolean		false
	 	 * String (or any object)  	null
	 	 *
	 	*/

		byte a = 15;
		System.out.println(a);
		
		short age = 150;                          
		System.out.println(age);
		
		int c = 100100;  
		System.out.println(c);
		
		double accountBalance = 34.67;                      // Single line declaration & initialization.
		System.out.println(accountBalance);
		
		int accountBalanceDollars = (int) accountBalance;  // Truncation (drop off) of decimal places to an integer.
		System.out.println(accountBalanceDollars);
		
		char middleInitial = 'C';                          // Use single quote for char
		System.out.println(middleInitial);
		
		boolean isHotOutside = true;
		System.out.println(isHotOutside);
		
		String firstName = "Sam";                          // Use double quotes for Strings
		System.out.println(firstName);
		
		String lastName = "Smith";                          // Use double quotes for Strings
		System.out.println(lastName);
		
		System.out.println(firstName + " " + lastName);     // + operator concatenates Strings together
		
		System.out.println(age + 30);
	
	
	}

}
