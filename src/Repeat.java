
public class Repeat {
	
public String RepeatWithString(String string, String string2, int i) {
	String a = 	""; 
		for (int j = 0; j < i-1; j++) {
			a+=string; 
			a+=string2; 
		} 
		 
		a+=string; 
		
		System.out.println(a);
		
		return a;
	}

boolean hasRepeatedChar(String s1) {
	String a = ""; 
	char b = ' '; 
	char c = ' '; 
	
	for (int i = 0; i < s1.length(); i++) {
		b = s1.charAt(i);
		
		for (int j = i+1; j < s1.length(); j++) {
			c = s1.charAt(j);
			
			if (b==c) {
				return true; 
			}
			
			System.out.println(b);
			System.out.println(c);
			
		}
	}
	
	
	
		
	
	return false;
	}
}


