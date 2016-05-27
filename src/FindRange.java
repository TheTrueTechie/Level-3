import java.util.ArrayList;
import java.util.Scanner;

public class FindRange {
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		int num = getUserMethod(s);
		a.add(num);

		while (num != 0) {

			num = getUserMethod(s);
			a.add(num);
			// System.out.println(num);

		}
		System.out.println("Numbers you typed        " + a);
		System.out.println("Lowest Number is " + FindMin(a));
		System.out.println("Highest Number is " + FindMax(a));

		int d = FindMax(a);
		int f = FindMin(a);

		int z = d - f;
		System.out.println(z);

	}

	private static int getUserMethod(Scanner s) {
		while(true) {
		
		try {
			int userInput;
			int num;

			System.out.println("Please input several numbers");
			s = new Scanner(System.in); 
			userInput = s.nextInt();
			return userInput;
			} catch (Exception e) {
			System.out.println("Invalid");
		} 
		}
	}

	public static int FindMin(ArrayList<Integer> a) {
		int currentNum;
		int minNum = 9999999;

		for (Integer c : a) {
			currentNum = c;
			if (currentNum < minNum) {
				minNum = c;
			}

			// System.out.println(minNum);
		}

		return minNum;

	}

	public static int FindMax(ArrayList<Integer> a) {
		int currentNum;
		int maxNum = -9999999;

		for (Integer c : a) {
			currentNum = c;
			if (currentNum > maxNum) {
				maxNum = c;
			}

			// System.out.println(minNum);
		}

		return maxNum;

	}
}
