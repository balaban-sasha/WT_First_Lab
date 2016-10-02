package Task_3;

public class ResultOfFunctionOnSegment {
	public double[] getFunctionResultsOnSegment(int a,int b,int h)
	{
		double[] array=new double[(Math.abs(b-a))/h+1];
		int i=0;
		while(a<b)
		{
			array[i]=Math.tan(a);
			i++;
			a+=h;
		}
		return array;
	}
}
