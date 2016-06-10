package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Cards> DeckOfCards = new ArrayList<Cards>();

	public Deck() {
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 13; j++) {

				if (i == 1) {
					DeckOfCards.add(new Cards("clubs", j));

				} else if (i == 2) {
					DeckOfCards.add(new Cards("spades", j));
				} else if (i == 3) {
					DeckOfCards.add(new Cards("hearts", j));
				} else if (i == 4) {
					DeckOfCards.add(new Cards("diamonds", j));
				}
			}
		}
		Collections.shuffle(DeckOfCards);
	}

}
