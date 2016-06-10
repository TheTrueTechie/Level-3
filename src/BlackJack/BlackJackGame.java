package BlackJack;

import java.util.Scanner;

public class BlackJackGame {
	Scanner scanner = new Scanner(System.in);
	
	Deck mainDeck = new Deck();
	Hand dealerHand = new Hand();
	Hand myHand = new Hand();

	public void main(String[] args) {
	Cards a = mainDeck.DeckOfCards.remove(0);
	
	dealerHand.Hand.add(a);
	
	Cards b = mainDeck.DeckOfCards.remove(0);
	
	dealerHand.Hand.add(b);
	
	System.out.println(b);
	}

	boolean isGameOver() {
		return false;
	}

}
