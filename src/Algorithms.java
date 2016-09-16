import java.util.Collections;
import java.util.List;
import java.util.PrimitiveIterator.OfDouble;

public class Algorithms {
	public static void main(String[] args) {

	}

	public static int findBrokenEgg(List<String> eggs) {
		int num = 0;
		for (String string : eggs) {

			if (eggs.get(num).equals("cracked")) {
				return num;
			}
			num++;
		}

		return num--;
	}

	public static int countPearls(List<Boolean> oysters) {
		int num = 0;

		for (Boolean boolean1 : oysters) {

			if (oysters.get(num).equals(true)) {
				return num;
			}
			num++;
		}

		return num--;
	}

	public static double findTallest(List<Double> peeps) {

		double num = 0;

		for (Double double1 : peeps) {
			if (double1 > num) {
				num = double1;
			}
		}

		return num;
	}

	public static String findLongestWord(List<String> words) {
		String word = "";

		for (String string : words) {

			if (string.length() > word.length()) {
				word = string;
			}

		}

		return word;
	}

	public static boolean containsSOS(List<String> message2) {
		boolean containsWord = false;

		for (String string : message2) {

			if (string.contains(" ... --- ... ")) {
				containsWord = true;

			}

		}

		return containsWord;
	}

	public static List<Double> sortScores(List<Double> results) {
		double num = 0;

		for (Double double1 : results) {

			if (double1>num) {
				num = double1;
			}
		}
		Collections.sort(results);
		return results;
	}

}
