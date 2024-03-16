package Week06CodeProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {

	int value;
	String name;
	int score;
	List<Card> hand = new ArrayList<Card>();
	
	
	
	
	public Player(String name) {
		this.score = 0;
		this.name = name;
	}
		
	
	public void describe() {
		System.out.println(this.name + ": " + this.score);
		for (Card card : this.hand) {
			card.describe();
		}
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}
	
	public int flip() {
		int temp = 0;
		temp = this.hand.remove(0).value;
		return temp;
	}
	
	public Card draw(Deck deck) {
		Card card = deck.draw();
		hand.add(card);
		return card;
	}
	
	
	public void incrementScore() {
		this.score++;
	}
}

