package Week06CodeProject;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Let's get ready to RUMBLE!!!");
		
		Deck myDeck = new Deck();
		
		System.out.println("Shuffling deck.................");
		myDeck.shuffle();
				
		Player player1 = new Player("Pablo");
		Player player2 = new Player("Hillary");
		
		System.out.println("Let's meet our players and see their current scores.");
		player1.describe();
		player2.describe();
		
		System.out.println("-----------------------------");
		System.out.println("Now let's Deal the cards out.");
		System.out.println("-----------------------------");
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
			player1.draw(myDeck);
			} else {
			player2.draw(myDeck);
			}
		}
		
		System.out.println("Here is Pablos's hand:\r\n");
		player1.describe();
		System.out.println("\r\n--------------------\r\n");
		System.out.println("Here is Hillary's hand:\r\n");
		player2.describe();
				
		System.out.println("\r\n---------------------\r\n");
//		System.out.println(player1.hand.get(0).value);
//		System.out.println(player2.hand.get(0).value);
		
		
		for (int index = 0; index < 26; index++) {
			System.out.println("Time for the next round. Players flip your cards!!!");
			int temp1 = player1.flip();
			int temp2 = player2.flip();
			if (temp1 > temp2) {
				player1.incrementScore();
				System.out.println(player1.name + " scored a point!");
			} else if (temp2 > temp1) {
				player2.incrementScore();
				System.out.println(player2.name + " scored a point!");
			} else {
				System.out.println("There was a tie.");
			} 
		}
		
		System.out.println("\r\n---------------------\r\n");
		System.out.println("Here is the final score:");
		System.out.println("\r\n---------------------\r\n");

		player1.describe();
		player2.describe();
		
				
}
	
}	

