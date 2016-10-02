package Task_2;

public class PointsOnGraph {
	public boolean checkPoints(int x,int y)
	{
		boolean resultOfChecking=false;
		if(((y<=5)&&(y>=0)&&(x>=-4)&&(x<=4))||((y>=-3)&&(y<=0)&&(x>=-6)&&(x<=6)))
			resultOfChecking = true;
		else
			resultOfChecking=false;
			
		return resultOfChecking;
	}
}

