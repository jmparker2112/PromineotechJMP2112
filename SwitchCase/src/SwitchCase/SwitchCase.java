package SwitchCase;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 3;
		
		switch (month) {

		    case 1:
		        System.out.println("January");
		        break;
		    case 2:
		    	System.out.println("February");
		    	break;
		    case 3:
		    	System.out.println("March");
		    	break;
		    case 4:
		    	System.out.println("April");
		    	break;
		    case 5:
		    	System.out.println("May");
		    	break;
		    case 6:
		    	System.out.println("June");
		    	break;
		    case 7:
		    	System.out.println("July");
		    	break;
		    case 8:
		    	System.out.println("August");
		    	break;
		    case 9:
		    	System.out.println("September");
		    	break;
		    case 10:
		    	System.out.println("October");
		    	break;
		    case 11:
		    	System.out.println("November");
		    	break;
		    case 12:
		    	System.out.println("December");
		    	break;
		    default:

		        System.out.println("Invalid Month");

		}

        month = 8;
        String monthString;
        switch (month) {
        case 1:  monthString = "January";
                 break;
        case 2:  monthString = "February";
                 break;
        case 3:  monthString = "March";
                 break;
        case 4:  monthString = "April";
                 break;
        case 5:  monthString = "May";
                 break;
        case 6:  monthString = "June";
                 break;
        case 7:  monthString = "July";
                 break;
        case 8:  monthString = "August";
                 break;
        case 9:  monthString = "September";
                 break;
        case 10: monthString = "October";
                 break;
        case 11: monthString = "November";
                 break;
        case 12: monthString = "December";
                 break;
        default: monthString = "Invalid month";
                 break;
    }
    System.out.println(monthString);
		
		

	}

}
