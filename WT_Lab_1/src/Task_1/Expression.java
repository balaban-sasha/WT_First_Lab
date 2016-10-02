package Task_1;

public class Expression {
	public double getResult(int x,int y)
	{
		double expressionResult;
		expressionResult=((1+Math.sin(x+y))/(2+((2*x)/(1+x*x*y*y)))+x);
		return expressionResult;
		
	}
}
