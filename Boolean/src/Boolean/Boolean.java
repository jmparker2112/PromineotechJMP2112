package Boolean;

public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// equality operator
		System.out.println(2 == 2);
		System.out.println(3 <= 5);
		System.out.println(2 > 5);
		System.out.println(5 <= 5);
	
		// boolean and && boolean or ||
		System.out.println(2 == 2 && 3 < 5);
		System.out.println( 3 == 2 || 4 < 5);
		
		int ageRequiredToDrive = 16;

		int currentAge = 14;

		boolean canPersonDrive = (currentAge >= ageRequiredToDrive);

		System.out.println(canPersonDrive);


		
	}

}
