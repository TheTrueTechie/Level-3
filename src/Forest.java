import java.util.ArrayList;
import java.util.Random;

public class Forest {
	public static void main(String[] args) {
		Random r = new Random();

		ArrayList<Tree> tree = new ArrayList<Tree>();
		for (int i = 0; i < 100; i++) {

			int x = r.nextInt(81);
			x = x + 21;

			Tree a = new Tree(x);
			tree.add(a);

			// System.out.println(x);
		}
		int c = 0;
		for (Tree tree2 : tree) {
			c += tree2.getHeight();
		}
		int f = 0;
		for (int i = 0; i++ < tree.size(); i++) {
			Tree t = tree.get(i);
			if (i == 0) {
				f = f + t.getHeight();
			}

			if (i == tree.size() - 1) {
				f = f + t.getHeight();
				
				
			}

		}

		System.out.println(f);

	}

}
