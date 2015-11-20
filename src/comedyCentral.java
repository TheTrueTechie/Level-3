import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class comedyCentral {
	public static void main(String[] args) {
		ArrayList<String> comedyCentral = new ArrayList<String>(); 
		ArrayList<String> punchLine = new ArrayList<String>(); 
		
		comedyCentral.add("Two people walk into a bar and say Can I have some H20 and the other friend says Can I have some H20 to.");
		punchLine.add("The second friend dies.");
		comedyCentral.add("Today a man knocked on my door and asked for a small donation towards the local swimming pool.");
		punchLine.add(" I gave him a glass of water");
		comedyCentral.add("I'm not saying I hate you, but I would unplug your life support to charge my phone.");
		comedyCentral.add("Just read that 4,153,237 people got married last year, not to cause any trouble but shouldn't that be an even number?");
		comedyCentral.add("I find it ironic that the colors red, white, and blue stand for freedom until they are flashing behind you.");
		
		JOptionPane.showMessageDialog(null, "Here comes your daily Joke/Punchline");
		
		int Random = new Random().nextInt(comedyCentral.size());
		int Random2 = new Random().nextInt(punchLine.size());
		JOptionPane.showMessageDialog(null, comedyCentral.get(Random));
		JOptionPane.showMessageDialog(null, punchLine.get(Random2));

	}
}
