package chapter6Arrays;

public class DeckTester {

	private static Deck deck = new Deck();
	
	public DeckTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Printing Deck...");
		
		printDeck();
		
		System.out.println("\r\n\r\nPrinted entire deck of cards.\r\n");
		

		System.out.println("Shuffle...");
		
		deck.shuffle();

		printDeck();

		System.out.println("\r\n\r\nPrinted entire deck of cards after Shufle.\r\n");

		//Create 5 hands
		for (int x = 0; x < 5; x++) {

			deck.shuffle();

			System.out.println("Hand " + (x+1));
			System.out.println("");
			
			createHand();			
		}
	}
	
	// print out the deck to ensure all 52 cards are created
	private static void printDeck() {
		
		int num = 1;
		while (deck.getNumCardsLeft() > 0) {
			System.out.println();

			Card c = deck.dealCard();
			
			System.out.print("Card " + num++ + " has Suit " + c.getSuit() + "    And Face  " + c.getFaceValue());
		}
	}

	// deal 5 cards in an array of 5 Card objects called ​hand.
	private static void createHand() {
		
		Card[] hand = new Card[5];

		int fv = -1;
		boolean hasPair = false;
		for (int x = 0; x < hand.length; x++) {

			hand[x] = deck.dealCard();		
						
			if(fv == hand[x].getFaceValue()) {
				hasPair = true;
			}
			
			fv = hand[x].getFaceValue();

			System.out.println(hand[x].toString());
		}
		
		if(hasPair) {
			System.out.println("\r\nThere is at least a pair in the hand.\r\n");			
		}
		else {
			System.out.println("\r\nThere isn't a pair.\r\n");			
		}
	}
}
