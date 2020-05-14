package chapter6Arrays;
//package Arrays;

import java.util.Random;

public class Deck {

	private Card[] deck;
	private int position = 0;
	public static final int BasicCards = 52;

	/**
	 * Creates a deck of 52 playing cards to represent every playing
	 * card in a regular deck of cards.  
	 */
	public Deck()
	{
		createDeck();
		position = 0;	
	}

	/**
	 * Creates an array of 52 cards to represent every card.
	 */
	private void createDeck()
	{
		deck = new Card[BasicCards];
		int p = 0;

		for (int v = Card.ACE; v <= Card.KING; v++) {
			
			for (int x = Card.CLUBS; x <= Card.SPADES; x++) {
			
				deck[p++] = new Card(v, x);
			}
		}
		
		System.out.println("\r\nDeck created with " + p + " cards.\r\n");
	}

	/**
	 * Puts all the cards back in the deck.
	 * Shuffles a deck of cards in random order.
	 * The position of the card goes back to the top.
	 */
	public void shuffle()
	{	
		for (int x = 0; x < deck.length; x++) {
			
			Random random = new Random();
			int transferNum = random.nextInt(BasicCards - 1);

			//Random random1 = new Random();
			//int card1 = random1.nextInt((52 - 0) + 1) + 0;
			
			//Random random2 = new Random();
			//int card2 = random2.nextInt((52 - 0) + 1) + 0;
			
			Card temp = deck[transferNum];
			
			deck[transferNum] = deck[x];
			
			deck[x] = temp;
		
		}
		
		position = 0;
	}

	/**
	 * As cards are dealt from the deck, the number of cards left
	 * decreases.  This function returns the number of cards that
	 * are still left in the deck.  The return value would be
	 * 52 when the deck is first created or after the deck has been
	 * shuffled.  It decreases by 1 each time the dealCard() method
	 * is called.
	 * @return the number of cards left in the deck to be dealt.
	 */
	public int getNumCardsLeft()
	{
		return (BasicCards - position);
	}

	/**
	 * Removes the next card from the deck and return it.  
	 * @return the next card from the deck
	 */
	public Card dealCard()
	{
		if(position >= BasicCards) {
			position = 0;
		}
		
		return deck[position++];
	}

	//public static void main(String[] args) {
		//// TODO Auto-generated method stub

	//}

}
