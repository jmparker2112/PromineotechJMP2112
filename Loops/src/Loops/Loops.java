package Loops;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 'for' loops are useful when you know how many
		 *  times something needs to run
		 */
//		for (int i =0; i < 10; i++) {
//			System.out.println(i);
//		}
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
		
		
		/* the second type of loops are know as 'while' loops
		 *  'while' loops are good for when you need to do something
		 *  until a condition is met but you have less information regarding
		 *  how many iterations are needed
		 */
		
//		int x = 0;
//		while (x < 10) {
//			System.out.println(x);
//			x++;
//		}
		
		/* 'do while' loops are similar to 'while' loops except 
		 * that they will always iterate at least once. in the above 'while' example
		 * let's say that x = 10. in that case, it will not run at all.
		 * this is not so with a 'do while' loop. 
		 */
		
		int x = 10;
		while (x < 10) {
			System.out.println("the value of x is " + x);
			x++;
		}
		
		do {
			System.out.println(x);
			x++;
		} while (x < 2);
		
		
		/* there is one more type of loop in Java
		 *  it is known as an 'enhanced for loop'
		 *  it performs an iteration for each item in a collection (list or array)
		 *  
		 */
		
	}
	
}
