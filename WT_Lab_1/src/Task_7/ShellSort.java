package Task_7;

public class ShellSort {
	
	public int[] getSortedArray(int[] array)
	{
		int i=0;
		while(i<(array.length-1))
		{
			if(array[i]<=array[i+1])
			{
				i++;
			}
			else
			{
				swap(array,i,i+1);
				if(i!=0)
				{
					i--;
				}
			}
		}
		return array;
	}
	private int[] swap(int[] array, int j, int i) {
		int temp=array[j];
		array[j]=array[i];
		array[i]=temp;
		return array;
		
	}
}
