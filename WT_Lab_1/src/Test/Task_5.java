package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import Task_5.WasteElements;

public class Task_5 {


	@Test
	public void test() {
		WasteElements wasteElements=new WasteElements();
		int[] array={3,4,5,2,3,4,5,6,7};
		wasteElements.getNumberOfWasteElements(array);
		System.out.print(1);
	}

}
