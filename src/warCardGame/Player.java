package warCardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>(); 
	int score;
	String name;
	
	//public Player() {
		//player1 = new ArrayList<Player>(); //figure out how to add player 1 and player 2 and call score to each player
		//player2 = new ArrayList<Player>();
	
	public Player(String name) { 
		this.score = 0; 
		this.name = name;
	}
	
	public void describe() {
		System.out.println("\nPlayer " + name + " " + "has " + score + " points!\n");
			for(Card card : hand) {
				card.describe();
			}
		System.out.println("*****************************************");
	}
	
	public Card flip() {
		Card drawnTopCard = hand.get(0);
		hand.remove(0);
		return drawnTopCard;
	}
	
	public void draw(Deck deck) {
		Card card = deck.draw();
		hand.add(card);
	}
	
	public void incrementScore() {
		this.score++; //increments by 1 
	}
} //end Player Class