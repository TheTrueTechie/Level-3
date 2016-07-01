package BlackJack;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoreAndMoreTests {

	
	
	
	@Test
	public void MultTest() {

		assertEquals("10 x 0 = 0", multiply(10, 0));
		assertEquals("10 x 10 = 100", multiply(10, 10));
		assertEquals("8 x 11 = 88", multiply(8, 11));
	}

	private String multiply(int i, int j) {
		int z = i * j;
		String a = i + " x " + j + " = " + z;
		return a;
	}

	@Test
	public void PrimeTest() {

		assertTrue(isPrime(3));
		assertTrue(isPrime(5));
		assertTrue(isPrime(541));
		assertFalse(isPrime(4));
		assertFalse(isPrime(12));
		assertFalse(isPrime(527));

	}

	private boolean isPrime(int i) {
		boolean a = true;
		for (int j = 2; j < i; j++) {
			if (i%j==0) {
				a = false;
			}
			
		}
		
		
		return a;
	}

	@Test
	public void SquareTest() {

		assertTrue(isSquare(4));
		assertTrue(isSquare(144));
		assertTrue(isSquare(64));
		assertTrue(isSquare(10201));
		assertTrue(isSquare(1));
		assertFalse(isSquare(3));
		assertFalse(isSquare(22));
		assertFalse(isSquare(143));

	}

	private boolean isSquare(int i) {
		int a;

		double z = Math.sqrt(i);
		boolean b = false;
		a = (int) z;

		if (z == a) {
			b = true;
		}
		return b;
	}

	@Test
	public void CubeTest() {

		assertFalse(isCube(9));
		assertTrue(isCube(27));
		assertTrue(isCube(216));
		assertTrue(isCube(729));
		assertTrue(isCube(1));
		assertFalse(isCube(3));
		assertFalse(isCube(22));
		assertFalse(isCube(143));

	}

	private boolean isCube(int i) {
		int q;
		boolean a = false;
	    double z = Math.cbrt(i);
		
	    q = (int) z;
	    
	    if (z==q) {
			a = true;
		}
	    
		return a;
	}

}
