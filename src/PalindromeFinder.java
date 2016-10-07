import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class PalindromeFinder {

	public static void main(String[] args) {
		PalindromeFinder a = new PalindromeFinder();
		String toString = "";
		try {
			FileReader fr = new FileReader(new File("test.txt"));
			int c = 0;
			while ((c = fr.read()) != -1) {
				char letter = (char) c;
				// System.out.print(letter);

				if (letter != '\n') {

					toString += letter;
				}
				if (letter == '\n') {
					

					if (a.isPalindrom(toString)) {
						System.out.println(toString + " is palindrome");

					}
					
					toString = ""; 
					
				}

				
			}
		} catch (Exception e) {
			System.out.println("Error loading file");

		}

	}

	boolean isPalindrom(String s) {
		for (int i = 0; i < s.length(); i++) {
			char first = s.charAt(i);
			char last = s.charAt(s.length() - i - 1);

			if (first != last) {

				return false;

			}
		}

		return true;

	}

	PalindromeFinder() {

	}

}
