package warCardGame;

public class App {
	
	public static void main(String[] args) {
		
		Deck fullDeck = new Deck();		//instantiates a deck
			
		fullDeck.shuffle();	//calls shuffle method on fullDeck
		
		
		Player player1 = new Player("Bob");	//instantiates players
		Player player2 = new Player("Jim");
		
		for(int i = 1; i <= 26; i++){ 		//iterates 26 cards to each player's hand
			player1.hand.add(fullDeck.draw()); 
			player2.hand.add(fullDeck.draw());
		}
		
		player1.describe();
		player2.describe();
		
		for (int i = 1; i <= 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			if (player1Card.getcardValue() > player2Card.getcardValue()) {	//compares final score for each player
				player1.incrementScore();
			} else if (player2Card.getcardValue() > player1Card.getcardValue()) {
				player2.incrementScore();
			} else {
				System.out.println("\nDraw!\n");
			} 
		}  
			
		if (player1.score > player2.score) {
			System.out.println("*****************************************\n");
			System.out.println(player1.name + "'s " + "final score is: " + player1.score + "\n");
			System.out.println(player2.name + "'s " + "final score is: "+ player2.score + "\n");
			System.out.println(player1.name + " wins this round! \n");
			System.out.println("*****************************************\n");
		} else if(player2.score > player1.score) {
			System.out.println("*****************************************\n");
			System.out.println(player1.name + "'s " + "final score is: " + player1.score + "\n");
			System.out.println(player2.name + "'s " + "final score is: "+ player2.score + "\n");
			System.out.println(player2.name + " wins this round! \n");
			System.out.println("*****************************************\n");
		} else {
			System.out.println("*****************************************\n");
			System.out.println(player1.name + "'s " + "final score is: " + player1.score + "\n");
			System.out.println(player2.name + "'s " + "final score is: "+ player2.score + "\n");
			System.out.println("Draw! There are no winners this round!\n");
			System.out.println("*****************************************\n");
		}
	} // End main method
} // End main class