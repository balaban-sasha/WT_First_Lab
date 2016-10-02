package Task_4;

public class SimpleNumbers {
	public int getSimpleNumbers(int N)
	{
		int[] a=new int[N];
		int numberOfSimpleElements=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=i;
		}
		for (int i=0;i<a.length;i++)
		{
			boolean flag=false;
			int j=2;
			if(a[i]<=0)
				flag=true;
			while((!flag)&&(j<a[i]))
			{
				if(((a[i]%j)==0)&&(a[i]>0))
					flag=true;
				j++;
			}
			if (!flag)
				numberOfSimpleElements++;
		}
		return numberOfSimpleElements;
	}
}
