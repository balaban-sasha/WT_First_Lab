package Task_9;

import java.util.HashMap;
import java.util.Map;

public class Backet {

	private Map<Integer,Ball>balls=new HashMap<Integer,Ball>();
	private int ballsNumber=0;
	public void addBall(Ball ball)
	{
		this.balls.put(ballsNumber, ball);
		ballsNumber++;
	}
	public int getNumberOfBlueBalls()
	{
		int numberOfBlueBalls=0;
		for(int i=0;i<ballsNumber;i++)
			if(this.balls.get(i).getBallColor()=="blue")
				numberOfBlueBalls++;
		return numberOfBlueBalls;
	}
	public int getWeightOfAllBalls()
	{
		int weightOfAllBalls=0;
		for(int i=0;i<ballsNumber;i++)
			weightOfAllBalls+=this.balls.get(i).getBallWeight();
		return weightOfAllBalls;
	}
	
}
