import java.util.ArrayList;

public class Decorator {
	public static void main(String[] args) {
		Ornament a = new Ornament();
		ArrayList<Ornament> hangIt = new ArrayList<Ornament>();
		for (int i = 0; i < 500; i++) {

			hangIt.add(new Ornament());
		}
		for (Ornament ornament : hangIt) {

			ornament.hangIt();
		}

	}
}
