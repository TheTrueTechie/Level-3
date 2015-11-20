import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class bannedNames {
	public static void main(String[] args) {
		ArrayList<String> Adjectives = new ArrayList<String>();
		ArrayList<String> Nouns = new ArrayList<String>();

		Adjectives.add("Cool");
		Adjectives.add("Mean");
		Adjectives.add("Bored");
		Adjectives.add("Happy");
		Adjectives.add("Sad");

		Nouns.add("Homo-Sapein");
		Nouns.add("Cole");
		Nouns.add("DJ");
		Nouns.add("Carter");
		Nouns.add("Human");

		int Random = new Random().nextInt(Adjectives.size());
		int Random2 = new Random().nextInt(Nouns.size());

		JOptionPane.showMessageDialog(null, "Adjectives And Noun Random Generator Now Loading... Please Wait");
		JOptionPane.showMessageDialog(null, Adjectives.get(Random) + " " + Nouns.get(Random2));
	}
}
