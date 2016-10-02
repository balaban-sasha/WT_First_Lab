package Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import Task_8.PlaceForElements;

public class Task_8 {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		int[] arrayWhereNeedToPut=
			{2,3,5,7,9,12,13,14,15,16,16,16,17,17,19,21};
		int[] arrayWhichNeedToPut={1,2,4,6,8,11,12,17,21,22,25,26};
		PlaceForElements placeForElements=new PlaceForElements();
		int[] expectedArray={0,0,1,2,3,4,4,11,14,15,15,15};
		Assert.assertArrayEquals(expectedArray, placeForElements.getNumberOfPlacesWhereNeedToPut(arrayWhereNeedToPut, arrayWhichNeedToPut));
	}
	@Test
	public void secondTest() {
		int[] arrayWhereNeedToPut=
			{1,2,3,4,5};
		int[] arrayWhichNeedToPut={0,3,5,10};
		PlaceForElements placeForElements=new PlaceForElements();
		int[] expectedArray={0,1,3,4};
		Assert.assertArrayEquals(expectedArray, placeForElements.getNumberOfPlacesWhereNeedToPut(arrayWhereNeedToPut, arrayWhichNeedToPut));
	}

}
