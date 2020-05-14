package chapter6Arrays;
//package chapter6;

public class Card {

	private int faceValue;
	private int suit;
	public static final int CLUBS = 0, DIAMONDS = 1, HEARTS = 2, SPADES = 3;
	public static final int ACE = 1, JACK = 11, QUEEN = 12, KING = 13;

	public Card (int fv, int s) {
		faceValue = fv;
		suit = s;
	}
	
	public int getFaceValue() {
		return faceValue;
	}
	
	public String getSuit() {
		String suits = "";
		
		if (suit == CLUBS) {
			suits = "Clubs";
		}
		else if (suit == DIAMONDS) {
			suits = "Diamonds";
		}
		else if (suit == HEARTS) {
			suits = "Hearts";
		}
		else if (suit == SPADES) {
			suits = "Spades";
		}
		
		return suits;
	}
	
	public boolean equals() {
		return (suit == faceValue);
	}
	
	public String toString() {
		
		String face = "";
		
		if (faceValue == ACE) {
			face = "Ace";
		}
		else if (faceValue == JACK) {
			face = "Jack";
		}
		else if (faceValue == QUEEN) {
			face = "Queen";
		}
		else if (faceValue == KING) {
			face = "King";
		}
		else {
			face = Integer.toString(faceValue);
		}
		
		return (face + " of " + Card.this.getSuit());
	}
}