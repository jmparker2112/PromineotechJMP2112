package Week05CodeProject;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		String myWord = "";
		for (int i = 0; i < log.length(); i++) {
			myWord += " " + log.charAt(i);
		} System.out.println(myWord);
	}

	@Override
	public void error(String error) {
		String myWord = "";
		for (int i = 0; i < error.length(); i++) {
			myWord += " " + error.charAt(i);
		} System.out.println("ERROR:" + myWord);
	}

}
