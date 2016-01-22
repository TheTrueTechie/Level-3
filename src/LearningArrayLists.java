import java.util.ArrayList;

public class LearningArrayLists {

	public static Object createArrayList() {
		ArrayList<String> ArrayList1 = new ArrayList<String>();
		return ArrayList1;
	}

	public static void addToArrayList(ArrayList list, String item) {
		list.add(item);

	}

	public static void testGetNumberOfItems() {

	}

	public static int getNumberOfItems(ArrayList testList) {
		return testList.size();
	}

	public static Object getItem(ArrayList testList, int number) {
		return testList.get(number);

	}

	public static Object iterateOver(ArrayList testList) {
		String result = "";
		for (Object s : testList) {
			result = result + (String) s;

		}
		return result;

	}

	public static Object findItemOnList(ArrayList testList, String find) {

		return testList.indexOf(find);

	}

	public static Object replaceItem(ArrayList testList, int number, String word) {
		return testList.set(number, word);

	}

	public static void insertItem(ArrayList testList, int number, String word) {
		testList.add(number, word);
	}

	public static ArrayList<Integer> createTypedArrayList() {

		return new ArrayList<Integer>();
	}

	public static Integer addAllInteger(ArrayList<Integer> testList) {
		int result = 0;
		for (int s : testList) {
			result = result + s;

		}
		return result;
	}

	public static ArrayList<String> createStringTypedArrayList() {

		return new ArrayList<String>();
	}

	public static String addAllString(ArrayList<String> testList) {
		String result = "";
		for (String s : testList) {
			result = result + s;

		}
		return result;
	}
}
