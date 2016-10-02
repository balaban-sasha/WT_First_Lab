package Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import Task_9.Backet;
import Task_9.Ball;
public class Task_9 {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		Backet backet = new Backet();
		backet.addBall(new Ball(32,"blue"));
		backet.addBall(new Ball(3,"blue"));
		backet.addBall(new Ball(4,"blue"));
		backet.addBall(new Ball(2,"blue"));
		backet.addBall(new Ball(32,"red"));
		backet.addBall(new Ball(3,"blue"));
		backet.addBall(new Ball(4,"red"));
		backet.addBall(new Ball(2,"blue"));
		assertEquals(82, backet.getWeightOfAllBalls());
		assertEquals(6,backet.getNumberOfBlueBalls());
	}
	@Test
	public void secondTest() {
		Backet backet = new Backet();
		backet.addBall(new Ball(0,"red"));
		backet.addBall(new Ball(0,"red"));
		backet.addBall(new Ball(0,"red"));
		backet.addBall(new Ball(0,"red"));
		backet.addBall(new Ball(0,"red"));
		backet.addBall(new Ball(0,"red"));
		backet.addBall(new Ball(0,"red"));
		backet.addBall(new Ball(0,"red"));
		assertEquals(0, backet.getWeightOfAllBalls());
		assertEquals(0,backet.getNumberOfBlueBalls());
	}

}
