package BlackJack;

public class Cards {

	private String suite;
	private int value;

	public Cards(String suite, int value) {
		this.suite = suite;
		this.value = value;
	}

	public int getValueForCount() {
		if (value < 10) {

			return value;

		} else if (value >= 11) {

			return 10;
		}

		return 0;
	}

	public boolean isAce() {
		if (value==1) {
			return true;
		}
		return false;
	}
	
	Cards(int i) {
		
	}

}
