import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString a = new ReverseString();
		a.startCode(); 

	}

	private void startCode() {
		
String z = reverseWord("Hello"); 
System.out.println(z);
	}

	private String reverseWord(String a) {
		Stack<Character> reverseTheString = new Stack<Character>();
		String q = "";
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			reverseTheString.push(c);

			

			
			
		}
		for (int i = 0; i < a.length(); i++) {
			
		
		q += reverseTheString.pop();
		}
		return q;
		
		

	}
}
