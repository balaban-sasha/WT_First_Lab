package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Task_1.Expression;

public class Task_1 {
	private static final double DELTA = 1e-15;
	@Test
	public void test() {
		Expression expression=new Expression();
		assertEquals(0.5,expression.getResult(0,0),DELTA);
		assertNotEquals(0.5,expression.getResult(1,0),DELTA);
	}

}
