
public class starString {

	public String starString(String string, String string2) {
		String s = string;
		String k = string2;
		String b = "";
		System.out.println(s);
		System.out.println(k);
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < k.length(); j++) {
				if (s.charAt(i) == k.charAt(i)) {

				}
			}
		}

		return null; 
	}

	public int addSpecial(int i, int j, int k) {
		 if (i==j) {
			j=0; 
		}
	
		 if (i==k) {
			k=0; 
		}
		 
		 if (j==k) {
			k=0;
		}
		 
		 return i+j+k; 
		 
	}

	public int countEvens(int[] t1) {
		int c = 0; 
		int a = 0; 
	
		for (int j = 0; j < t1.length; j++) {
			
 
		
		System.out.println(t1[j]); 
		
		if (t1[j]%2==0) {
			c = c + 1; 
			
		}
		

		}
		System.out.println(c);
		return c;
	}

}
