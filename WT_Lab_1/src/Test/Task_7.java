package Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import Task_7.ShellSort;

public class Task_7 {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		int[] array={3,4,2,1,2,4,5,6,7,5,4,3,2,5,6};
		ShellSort shellSort=new ShellSort();
		int[] expectedArray={1,2,2,2,3,3,4,4,4,5,5,5,6,6,7};
		Assert.assertArrayEquals(expectedArray, shellSort.getSortedArray(array));
	}

	@Test
	public void secondTest() {
		int[] array={9,8,7,6,5,4,3,2,1,0};
		ShellSort shellSort=new ShellSort();
		int[] expectedArray={0,1,2,3,4,5,6,7,8,9};
		Assert.assertArrayEquals(expectedArray, shellSort.getSortedArray(array));
	}

}
