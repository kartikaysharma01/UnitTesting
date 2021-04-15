package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {

        jUnitTesting addString = new jUnitTesting();
        String result = addString.addStrings("Kartik","ay");
        assertEquals("Kartikay",result);

        result = addString.addStrings("Shar","ma");
        assertEquals("Sharma",result);
    }

}
