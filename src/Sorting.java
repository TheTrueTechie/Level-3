import java.util.ArrayList;

public class Sorting {
	static ArrayList<Integer> intList = new ArrayList<Integer>();
	static ArrayList<Integer> intList2 = new ArrayList<Integer>();

	public static void main(String[] args) {
		Sorting a = new Sorting();
		a.startCode();

	}

	private int minMethod() {
		int min = 100000;
		for (int HL4 : intList) {
			if (HL4 < min) {
				min = HL4;
			}
		}
		return min;
	}

	private void startCode() {
		intList.add(21);
		intList.add(7);
		intList.add(1738);

		while (intList.size() > 0) {
			int min = minMethod();
			intList2.add(min);
			intList.remove(intList.indexOf(min));

			//System.out.println(intList2);

		}
		for (Integer i : intList2) {
			System.out.println(i);
		}
		minMethod();
	}
}
