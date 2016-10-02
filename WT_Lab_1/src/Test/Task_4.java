package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import Task_4.SimpleNumbers;

public class Task_4 {

	@Test
	public void test() {
		SimpleNumbers simpleNumbers=new SimpleNumbers();
		assertEquals(2,simpleNumbers.getSimpleNumbers(3));
		assertEquals(4,simpleNumbers.getSimpleNumbers(6));
		assertEquals(0,simpleNumbers.getSimpleNumbers(1));
	}

}
