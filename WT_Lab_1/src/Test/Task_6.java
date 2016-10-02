package Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import Task_6.NewArray;

public class Task_6 {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		NewArray newArray=new NewArray();
		int[][] expectedArray={{1,2},{2,1}};
		int[] array={1,2};
		Assert.assertArrayEquals(expectedArray, newArray.getNewArray(array));
	}
	
	@Test
	public void secondTest() {
		NewArray newArray=new NewArray();
		int[][] expectedArray={{1,2,3,4,5},{2,3,4,5,1},{3,4,5,1,2},{4,5,1,2,3},{5,1,2,3,4}};
		int[] array={1,2,3,4,5};
		Assert.assertArrayEquals(expectedArray, newArray.getNewArray(array));
	}

}
