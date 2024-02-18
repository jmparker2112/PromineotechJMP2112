package Operations;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			/* Operators perform actions on operands
			 * 
			 * Key operations:
			 *   Assignment operator
			 *      = 
			 *   
			 *   Arithmetic operators
			 *      + Addition (also used for String concatenation)
			 *      - Subtraction
			 *      * Multiplication
			 *      / Division
			 *      % Remainder (from Division)
			 *   
			 *   Unary operators
	         *      +  Unary plus operator; indicates positive value (numbers are positive without this, however)
	         *      -  Unary minus operator; negates an expression
	         *      ++ Increment operator; increments a value by 1
	         *      -- Decrement operator; decrements a value by 1
	         *      !  Logical complement operator; inverts the value of a boolean
	         *
	         *   Equality operators
			 *      == Equals - Compares for equality in two values
			 *      != Not Equal - Compares for inequality in two values
			 *   
			 *   Logical operators
			 *      && logical AND
			 *      || logical OR
			 *      
			 *   Relational operators
			 *      > Greater than
			 *      < Less than
			 *      >= Greater than or equal
			 *      <= Less than or equal
			 *      instanceof - checks to see if an object is an instance of a certain class
			 * 
	         */
			
			int age = 34 * 2;                    // Assignment & Arithmetic (multiplication) operations
			System.out.println(age);
			age = age + 1;                       // Assignment & Arithmetic (addition) operation
			System.out.println(age);
			
				
			String firstName = "Tommy";
			String lastName = "Smith";
			String fullName = firstName + " " + lastName;   // Concatenation operation, joins strings together
			System.out.println(fullName);

			boolean isAge30 = age == 30;        // Equality operators - comparison for equality in values.
			System.out.println(isAge30);
			System.out.println(!isAge30);       // ! Logical compliment operator, inverts the value of a boolean
			System.out.println(age == 69);
			
			
			age = age + 1;
			System.out.println(age);
			age += 1;          // Variation assignment/arithmetic operation (addition) combined using +=
			System.out.println(age);
			age++;
			System.out.println(age);
			age -= 1;          // Variation assignment/arithmetic operation (subtraction) combined using -=
			System.out.println(age);
			age--;
			System.out.println(age);
			
	}

}
