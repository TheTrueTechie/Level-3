import java.util.Stack;

public class StringManipulator {

	public String capitalizeword(String string) {
		String capWord = "";
		
		string=string.toUpperCase();
		
		System.out.println(string);
		
		return string;
	}
	
	public String reversWord(String string) {
		String revWord = "";
		Stack<Character> rev = new Stack<Character>();
		
		for (int i = 0; i < string.length(); i++) {
			rev.push(string.charAt(i));
			
		}
		
		for (int j = 0; j < string.length(); j++) {
		revWord += rev.pop();
		}
		System.out.println(revWord);
		return revWord;
		
		
		
	}

}
