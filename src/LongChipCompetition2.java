import java.util.ArrayList;
import java.util.Random;

public class LongChipCompetition2 {

	/**
	 * The Beatles are eating lunch and playing a game to see who has the
	 * longest chip. (In England, french fries are called "chips".)
	 *
	 *
	 * 
	 * Find the Beatle with the longest chip. You may not edit the Chip or
	 * Beatle classes. Make sure to initialize The Beatles before you start your
	 * search.
	 * 
	 **/

	private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();
	String k;
	public static void main(String[] args) {
		LongChipCompetition2 a = new LongChipCompetition2();

		a.initializeBeatles();

		a.start();

	}

	private void start() {

		double highest = 0;

		for (Beatle z : theBeatles) {
			ArrayList<Chip> c = z.getChips();
			for (Chip chip : c) {

				if (highest < chip.getLength()) {
					highest = chip.getLength();

				}

			 k =	z.getName(); 
			}

		}
		System.out.println(highest);
		System.out.println(k);

		
	}

	private void initializeBeatles() {
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");

		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}
}

class Beatle {
	private String name;
	private ArrayList<Chip> chips = new ArrayList<Chip>();

	public Beatle(String name) {
		this.name = name;
		initializePlateOfChips();
	}

	private void initializePlateOfChips() {
		int numberOfChips = new Random().nextInt(100);
		for (int i = 0; i < numberOfChips; i++) {
			chips.add(new Chip(new Random().nextDouble() * 10));
			if (this.name.contains("in"))
				chips.add(new Chip(10));
		}
	}

	public ArrayList<Chip> getChips() {
		return this.chips;
	}

	public String getName() {
		return this.name;
	}

}

class Chip {
	private double length;

	public double getLength() {
		return length;
	}

	Chip(double d) {
		this.length = d;
	}
}
