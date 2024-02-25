package StringBuilderExample;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Bob";
		String lastName = "Brown";
		String middleInitial = "B";
		String space = " ";
		
		System.out.println(firstName);
		System.out.println(lastName);
		
		StringBuilder sb = new StringBuilder();
		
		//use append() to dynamically create a String using StringBuilder
		sb.append(firstName);
		sb.append(space);
		sb.append(lastName);
		System.out.println(sb.toString());

		//add a middle initial
		sb.insert(firstName.length()+1, middleInitial + space);
		System.out.println(sb.toString());
	}

}
