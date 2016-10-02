package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import Task_2.PointsOnGraph;
import junit.framework.Assert;

public class Task_2 {

	@Test
	public void test() {
		PointsOnGraph points=new PointsOnGraph();
		assertTrue(points.checkPoints(1,2));
		assertTrue(points.checkPoints(-1,2));
		assertFalse(points.checkPoints(-10,2));
	}

}
