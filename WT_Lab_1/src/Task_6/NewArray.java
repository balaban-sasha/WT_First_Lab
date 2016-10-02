package Task_6;

public class NewArray {
	public int[][] getNewArray(int[] array)
	{
		int[][] newArray = new int[array.length][array.length];
		for(int i=0;i<array.length;i++)
		{
			for (int j=0;j<array.length;j++)
			{
				newArray[i][j]=array[(j+i)%array.length];
			}
		}
		return newArray;
	}
}
