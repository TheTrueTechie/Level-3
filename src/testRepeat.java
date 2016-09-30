import static org.junit.Assert.*;

import org.junit.Test;

public class testRepeat {
Repeat r = new Repeat(); 
	@Test
	public void testRepeatWithString() {
		String s1 = "bobxbobxbob"; 
		String s2 = "AabcAabcAabcA"; 
		
		assertEquals(s1, r.RepeatWithString("bob", "x", 3));
		assertEquals(s2, r.RepeatWithString("A", "abc", 4)); 
	}
	@Test
	public void testRepeatedChar() {
		String s1 = "turtle";
		String s2 = "name";
		String s3 = "ladder";
		String s4 = "computer";
	
		assertTrue(r.hasRepeatedChar(s1));
		assertFalse(r.hasRepeatedChar(s2));
		assertTrue(r.hasRepeatedChar(s3));
		assertFalse(r.hasRepeatedChar(s4));

		
		
	}

	
	

}
