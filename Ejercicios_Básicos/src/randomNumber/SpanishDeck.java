package randomNumber;

import java.util.ArrayList;;

public class SpanishDeck {
			
	private static ArrayList<String> Deck = new ArrayList<String>();
	
	public static void addCards() {
		Deck.add("Ace of golds");
		Deck.add(String.valueOf(2)+" of golds");
		Deck.add(String.valueOf(3)+" of golds");
		Deck.add(String.valueOf(4)+" of golds");
		Deck.add(String.valueOf(5)+" of golds");
		Deck.add(String.valueOf(6)+" of golds");
		Deck.add(String.valueOf(7)+" of golds");
		Deck.add("Jack of golds");
		Deck.add("Horse of golds");
		Deck.add("King of golds");
		
		Deck.add("Ace of cups");
		Deck.add(String.valueOf(2)+" of cups");
		Deck.add(String.valueOf(3)+" of cups");
		Deck.add(String.valueOf(4)+" of cups");
		Deck.add(String.valueOf(5)+" of cups");
		Deck.add(String.valueOf(6)+" of cups");
		Deck.add(String.valueOf(7)+" of cups");
		Deck.add("Jack of cups");
		Deck.add("Horse of cups");
		Deck.add("King of cups");
		
		Deck.add("Ace of swords");
		Deck.add(String.valueOf(2)+" of swords");
		Deck.add(String.valueOf(3)+" of swords");
		Deck.add(String.valueOf(4)+" of swords");
		Deck.add(String.valueOf(5)+" of swords");
		Deck.add(String.valueOf(6)+" of swords");
		Deck.add(String.valueOf(7)+" of swords");
		Deck.add("Jack of swords");
		Deck.add("Horse of swords");
		Deck.add("King of swords");

		Deck.add("Ace of clubs");
		Deck.add(String.valueOf(2)+" of clubs");
		Deck.add(String.valueOf(3)+" of clubs");
		Deck.add(String.valueOf(4)+" of clubs");
		Deck.add(String.valueOf(5)+" of clubss");
		Deck.add(String.valueOf(6)+" of clubs");
		Deck.add(String.valueOf(7)+" of clubs");
		Deck.add("Jack of clubs");
		Deck.add("Horse of clubs");
		Deck.add("King of clubs");
	}
	
	public static String showCard() {
		return Deck.get((int) (Math.random()*Deck.size()));
	}
	
	public static void main(String[] args) {
		SpanishDeck.addCards();
		System.out.println(SpanishDeck.showCard());

	}

}
