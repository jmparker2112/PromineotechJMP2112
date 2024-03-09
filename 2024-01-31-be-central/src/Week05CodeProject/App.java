package Week05CodeProject;

public class App {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		
		logger.log("Hello");
		logger.error("Greetings");

		logger2.log("WASSUP");
		logger2.error("WASSUP FOOL!!!");
	
	}
}
