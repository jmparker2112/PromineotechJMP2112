package Week01;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This is a comment. 
		
		/* 
		 * This is also a comment
		 */
		
		
		System.out.println("Hello world!!!\r\n");
//	    System.out.println( "hello world".charAt(0) != 'H');

        boolean a = true;
        boolean b = true;
        boolean c = false;
	    
	    boolean result = (a && b) || (a && c) || (b && c);
	    System.out.println(result);		
		
		// System properties accessible in Java language in System class
		// https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
		System.out.println("  Java Version: " + System.getProperty("java.version"));
		System.out.println("   Computer HW: " + System.getProperty("os.arch"));
		System.out.println("           O/S: " + System.getProperty("os.name"));
		System.out.println("User Directory: " + System.getProperty("user.dir"));
		}
}
