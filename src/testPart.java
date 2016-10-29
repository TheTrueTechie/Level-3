import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class testPart {

	@Test
	public void testGetFirstThreeChars() {
		assertEquals("can", getFirstThreeChars("canalope"));
		assertEquals("app", getFirstThreeChars("application"));
		assertEquals("Sev", getFirstThreeChars("Seven"));

	}

	private String getFirstThreeChars(String string) {
		char[] a = string.toCharArray();
	
		
		
		
		String c = "";
		
		for (int j = 0; j < 3; j++) {

		c+=a[j];
		
		
		
		}
		System.out.println(c);
		return c;
	}

	@Test
	public void testAddUnlessSame() {
		assertEquals(7, addUnlessSame(3, 4));
		assertEquals(0, addUnlessSame(10, 10));
		assertEquals(25, addUnlessSame(5, 20));
		assertEquals(0, addUnlessSame(1, 1));

	}

	private int addUnlessSame(int i, int j) {
		int z = 0;
		if (i == j) {
			z = i - j;
		}

		else {
			z = i + j;
		}

		return z;
	}

	@Test
	public void testReduceArray() {
		double[] a1 = { 10.0, 5.0, 24.0 };
		double[] a2 = { 5.0, 2.5, 12.0 };

		assertArrayEquals(a2, reduceArrayByHalf(a1, 0.0001));

	}

	private Object reduceArrayByHalf(double[] a1, double d) {

		return null;
	}

}
