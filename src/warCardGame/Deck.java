package warCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	//private Card[] cards = new Card[52]; //array size set to 52 since there are 52 cards in typical card deck not counting jokers
	//private int topOfDeck = 0; no need for this get rid
	
	//ArrayList<Card> deck; no need for this get rid
	List<Card> cards = new ArrayList<Card>(); //use arraylist rather than array since arrayList maintains order 
	/**
	 * The constructor for Deck class - adding cards to deck
	 * 'n' for loop made for cardName which are suits in the deck
	 * 'v' for loop made for cardValue which are values of cards in deck
	 */
	public Deck () {
		for (int n = 0; n < 4; n++) {
			for (int v = 2; v <= 14; v++) {
				cards.add(new Card (n, v)); 
			}
		}	
	}
	
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
		
//method to draw top card from top of deck
	public Card draw() {
		if (cards.isEmpty()){
			return null; 
		} else {
			Card drawnTopCard = cards.get(0);
			cards.remove(0);
			return drawnTopCard;
		}
	}
	
//shuffle method shuffles cards over 52 iterations
	public void shuffle() {
		Collections.shuffle(cards);
		
	} 
} //End deck class 