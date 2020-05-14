package chapter4WritingClasses;

public class CardTester {

	public static void main(String[] args) {	
		
	
		for (int y = 0; y <= 3; y ++) {
		for (int x = 1; x <= 13; x ++) {
				Card card = new Card(x, y);
				
				System.out.println(card);
			}
		
			System.out.println("");
		}
		
		Card card1 = new Card(4, Card.DIAMONDS);
		Card card2 = new Card(8, Card.SPADES);
		Card card3 = new Card(4, Card.DIAMONDS);

	
		System.out.println("Card 1");
		System.out.println("Expected Face Value: " + 4 + " Desired Face Value: " + card1.getFaceValue());
		System.out.println("Expected Suit Value: " + "DIAMONDS" + " Desired Suit: " + card1.getSuit());

		System.out.println("");

		System.out.println("Card 2");
		System.out.println("Expected Face Value: " + 8 + " Desired Face Value: " + card2.getFaceValue());
		System.out.println("Expected Suit Value: " + "SPADES" + " Desired Suit: " + card2.getSuit());

		System.out.println("");

		System.out.println("Card 3");
		System.out.println("Expected Face Value: " + 4 + " Desired Face Value: " + card3.getFaceValue());
		System.out.println("Expected Suit Value: " + "DIAMONDS" + " Desired Suit: " + card3.getSuit());

		System.out.println("");

		System.out.println("Expected Card 1 and 2 are not equal");
		System.out.println("Desired Face Value: "+ (card1.getFaceValue() == card2.getFaceValue()));
		System.out.println("Desired Suit Value: "+ (card1.getSuit() == card2.getSuit()));

		System.out.println("");

		System.out.println("Expected Card 1 and 3 are equal");
		System.out.println("Desired Face Value: "+ (card1.getFaceValue() == card3.getFaceValue()));
		System.out.println("Desired Suit Value: "+ (card1.getSuit() == card3.getSuit()));
	}
}