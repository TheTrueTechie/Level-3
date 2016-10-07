
public class ValidPassword {
	public static void main(String[] args) {
		ValidPassword a = new ValidPassword();
		a.checkPass("DDadsasdad!:D");
	}

	private void checkPass(String pass) {
		for (int i = 0; i < pass.length(); i++) {
			char a = pass.charAt(i);
			int upTotal = 0;
			int digTotal = 0;
			int specTotal = 0; 

			if (Character.isUpperCase(a)) {
				upTotal += 1;
			}
			if (Character.isDigit(a)) {
				digTotal += 1;
			}

			if (a == '!' || a == '@' || a == '#' || a == '$' || a == '%' || a == '^' || a == '&' || a == '*' || a == '(' || a == ')') {

			}

		}

	}

}
