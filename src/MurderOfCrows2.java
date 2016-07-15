import java.util.ArrayList;
import java.util.Random;

public class MurderOfCrows2 {

	ArrayList<Crow2> theMurder = new ArrayList<Crow2>();

	public static void main(String[] args) {
		MurderOfCrows2 murderOfCrows = new MurderOfCrows2();
		murderOfCrows.initializeCrows();
		murderOfCrows.findTheDiamond();
	}

	private void findTheDiamond() {
		/*
		 * 1. One of the Crows has eaten the diamond. You need to search through
		 * the stomach of each Crow, then print the name of the guilty Crow.
		 */
		int trackingTimes = 0; 

		for (Crow2 crow : theMurder) {
			ArrayList<String> Clone = crow.getStomachContents();

			String a = ""; 
		for (String c : Clone) {
			if (c.equals("diamond")) {
		a = crow.getName();
		System.out.println(a);
		
			} 
			
		}
		trackingTimes = trackingTimes + 1;


		}
		/*
		 * 2. How many innocent crows had to die before the diamond was found?
		 */

	}

	private void initializeCrows() {
		theMurder.add(new Crow2("Rok"));
		theMurder.add(new Crow2("Merle"));
		theMurder.add(new Crow2("Poe"));
		theMurder.add(new Crow2("Grenwyn"));
		theMurder.add(new Crow2("Crawford"));
		hideTheDiamond();
	}

	private void hideTheDiamond() {
		int randomness = new Random().nextInt(theMurder.size());
		theMurder.get(randomness).getStomachContents().add("diamond");
	}
}
