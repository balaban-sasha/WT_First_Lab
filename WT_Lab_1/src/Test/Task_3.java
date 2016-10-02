package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import Task_3.ResultOfFunctionOnSegment;

public class Task_3 {
	private static final double DELTA = 1e-2;
	@Test
	public void test() {
		ResultOfFunctionOnSegment resultOfFunction=new ResultOfFunctionOnSegment();
		double[] actuals=resultOfFunction.getFunctionResultsOnSegment(1,8,4);
		double[] expectedArray={1.557407724,-3.38051};
		Assert.assertArrayEquals(expectedArray, actuals, DELTA);
	}

}
