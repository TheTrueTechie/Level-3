import static org.junit.Assert.*;

import org.junit.Test;

public class testStar {

	starString a = new starString(); 
	
	@Test
	public void testStarString() {
		assertEquals("***de***", a.starString("abcdefgh", "de"));
		assertEquals("1***", a.starString("1234", "1"));
		assertEquals("r*****r", a.starString("racecar", "r"));
	}


	@Test
	public void testAddSpecial() {
		assertEquals(6, a.addSpecial(1, 2, 3));
		assertEquals(10, a.addSpecial(4, 6, 4));
		assertEquals(2, a.addSpecial(2, 2, 2));

	}
@Test
	public void testCountEvens() {
		int[] t1 = { 1, 2, 3, 4 };
		int[] t2 = { 2, 2, 2, 2, 2, };
		int[] t3 = { 8, 6, 7, 5, 3, 0, 9 };

		assertEquals(2, a.countEvens(t1));
		//assertEquals(5, a.countEvens(t2));
		//assertEquals(3, a.countEvens(t3));

	}

}
