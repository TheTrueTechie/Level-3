import java.util.Random;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class Randomness {
	public static Random r = new Random();

	public static void main(String[] args) {
		RandomBooleanAnswer();
	}

	public static boolean RandomBooleanAnswer() {
		
		boolean a;
		a = r.nextBoolean();
		System.out.println(a);
		return a;
	}
	public static int RandomNumberToTen() {
		
		
		return r.nextInt(9);
	}
	
}
