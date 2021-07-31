package warCardGame;

public class Card {
	
	//Declaring suits as integers to better integrate into card array to build deck <- cardName
	public static final int CLUBS = 0;
	public static final int DIAMONDS = 1;
	public static final int HEARTS = 2;
	public static final int SPADES = 3;
	
	
	//Assigning integer values to Jack, Queen, King, Ace for future card comparison <- cardValue
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int ACE = 14;
	
	private int cardName;		
	private int cardValue;
	

	/**
	 * The constructor for Card class
	 * @param cardName = "Clubs", "Diamonds", "Hearts", "Spades"
	 * @param cardValue = 2, 3, 4, 5, 6....11, 12, 13, 14 (Ace is 14)
	 */
	public Card(int cardName, int cardValue) {
		this.setCardName(cardName);
		this.setCardValue(cardValue);	
	}

//This ensures the name of CardName does not allow input outside cardName parameters
	private void setCardName(int newCardName) {
		if (newCardName >= 0 && newCardName <= 3) {
			this.cardName = newCardName;
		} else {
			throw new IllegalArgumentException("Card name needs to be between 0 and 3!");
		}
	}
	
//This ensures the value of CardValue does not allow input values that are not within our cardValue parameters
	private void setCardValue(int newCardValue) {	
		if (newCardValue < 2 || newCardValue > 14) {
			throw new IllegalArgumentException("Card value needs to be between 2 and 14!");
		}
		this.cardValue = newCardValue;
	}
	
	public int getcardName() {
		return cardName;
	}
	
	public int getcardValue() {
		return cardValue;
	}
	
//Defining cardValue for cardValues including integers so it is easier to read and defining cardName to call in main method
	
	public String toString() {		//this describes each card	
		String s = "";
			if (cardValue == JACK) {
				s += "Jack";
			} else if (cardValue == QUEEN) {
				s += "Queen";
			} else if (cardValue == KING) {
				s += "King";
			} else if (cardValue == ACE) {
				s += "Ace";
			} else if (cardValue == 2) {
				s += "Two";
			} else if (cardValue == 3) {
				s += "Three";
			} else if (cardValue == 4) {
				s += "Four";
			} else if (cardValue == 5) {
				s += "Five";
			} else if (cardValue == 6) {
				s += "Six";
			} else if (cardValue == 7) {
				s += "Seven";
			} else if (cardValue == 8) {
				s += "Eight";
			} else if (cardValue == 9) {
				s += "Nine";
			} else if (cardValue == 10) {
				s += "Ten";
			} else {
				s += cardValue;
			}
			
			s += " of ";
			
			if (cardName == CLUBS) {
				s += "Clubs";
			} else if (cardName == DIAMONDS) {
				s += "Diamonds";
			} else if (cardName == HEARTS) {
				s += "Hearts";
			} else if (cardName == SPADES) {
				s += "Spades";
			}
		return s; //testing to ensure cardValue and cardValue will print correct values not memory location
	}

	public void describe() {
		System.out.println(this.toString() + "\n");
		
	}
 	
} //end Card class 
