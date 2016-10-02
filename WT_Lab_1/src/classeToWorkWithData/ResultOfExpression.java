package classeToWorkWithData;

import static org.junit.Assert.assertEquals;

import Task_9.Backet;
import Task_9.Ball;

public class ResultOfExpression {
	
	public static void main(String[] args)
	{

		Backet backet = new Backet();
		backet.addBall(new Ball(0,"red"));
		backet.addBall(new Ball(0,"red"));
		backet.addBall(new Ball(0,"red"));
		backet.addBall(new Ball(0,"red"));
		backet.addBall(new Ball(0,"red"));
		backet.addBall(new Ball(0,"red"));
		backet.addBall(new Ball(0,"red"));
		backet.addBall(new Ball(0,"red"));
		System.out.println(backet.getWeightOfAllBalls());
		System.out.println(backet.getNumberOfBlueBalls());
		
	}
	
	
}
