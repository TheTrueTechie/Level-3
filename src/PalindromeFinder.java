import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class PalindromeFinder {
	ArrayList<String>wordList; 
	
	ArrayList<String> readFromFile(String filename) {
		try {
			FileReader fr = new FileReader(new File(filename));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		String word = ""; 
		char currentChar = ' ';
		
		
		
		
		return wordList;
	}
	PalindromeFinder() {
		wordList = new ArrayList<String>(); 
		
	}
	

}
