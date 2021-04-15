package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumber {

	@Test
	public void test() {
        jUnitTesting addNum = new jUnitTesting();
        int result = addNum.addNumbers(100, 50);
        assertEquals (150,result);

        result = addNum.addNumbers(200, 10);
        assertEquals (210, result);
    }

}
