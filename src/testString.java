import static org.junit.Assert.*;

import org.junit.Test;

public class testString {

	@Test
	public void testStringManipulator() {
		StringManipulator sm = new StringManipulator(); 
		assertEquals("sdrawkcab", sm.reversWord("backwards"));
		assertEquals("CAPITAL", sm.capitalizeword("capital"));
	}

}
