package BlackJack;

import java.util.ArrayList;

public class Hand {
	ArrayList<Cards> Hand = new ArrayList();

	public Hand() {

	}

	public int getCount() {
		int b = 0;
		for (Cards a : Hand) {
			b = b + a.getValueForCount();

		}
		return b;
	}

	public boolean hasAce() {
		boolean b = false;
		for (Cards a : Hand) {
			if (a.isAce()) {
				b = true;
			}

		}
		return b;
	}

	public boolean isOver21() {
		boolean b = false;
		if (getCount()>=22) {
			b = true;
		}
		return b;
	}

	public boolean isOver16() {
		boolean b = false;
		if (getCount()>=17) {
			b = true;
		}
		return b;
	}
}
