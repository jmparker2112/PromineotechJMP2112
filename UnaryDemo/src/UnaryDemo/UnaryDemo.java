package UnaryDemo;

public class UnaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         * Unary operators
         *    +	 Unary plus operator; indicates positive value (numbers are positive without this, however)
         *    -	 Unary minus operator; negates an expression
         *    ++ Increment operator; increments a value by 1
         *    -- Decrement operator; decrements a value by 1
         *    !	 Logical complement operator; inverts the value of a boolean
         */
    	
    	int result = +1;
        // result is now 1
        System.out.println(result);

        result--;
        // result is now 0
        System.out.println(result);

        result++;
        // result is now 1
        System.out.println(result);

        result = -result;
        // result is now -1
        System.out.println(result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
	}

}
