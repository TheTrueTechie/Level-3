import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class dinnerDecider {
	public static void main(String[] args) {
		ArrayList<String> foodList = new ArrayList<String>();
		
		foodList.add("Bean & Cheese Burrito");
		foodList.add("Vegetiran Bacon"); 
		foodList.add("Cheese Pizza");
		foodList.add("Mashed Potatoes");
		foodList.add("Hot Choclate");
		
		int Random = new Random().nextInt(foodList.size());
		
		JOptionPane.showMessageDialog(null, "What will you have for dinner. Loading.... Please Wait");
		JOptionPane.showMessageDialog(null, "Done! " + foodList.get(Random));
			}
}
