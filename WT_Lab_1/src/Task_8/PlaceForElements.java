package Task_8;

public class PlaceForElements {
	public int[] getNumberOfPlacesWhereNeedToPut(int[] arrayWhereNeedToPut,int[] arrayWhichNeedToPut)
	{
		int[] numberOfPlaceWhereNeedToPut=new int[arrayWhichNeedToPut.length];

		int numberOfElement=0;
		for (int i=0;i<arrayWhichNeedToPut.length;i++)
		{
			boolean flag=false;
			while((!flag)&&((numberOfElement+2)<arrayWhereNeedToPut.length))
			{
				if(((arrayWhichNeedToPut[i]<arrayWhereNeedToPut[numberOfElement])&&(arrayWhichNeedToPut[i]>arrayWhereNeedToPut[numberOfElement+1]))||(arrayWhichNeedToPut[i]>arrayWhereNeedToPut[numberOfElement+1]))
					
					numberOfElement++;
				else
					if(arrayWhichNeedToPut[i]<arrayWhereNeedToPut[numberOfElement])
					{
						numberOfPlaceWhereNeedToPut[i]=numberOfElement;
						flag=true;
					}
					else
					{
						numberOfPlaceWhereNeedToPut[i]=numberOfElement;
						flag=true;
					}
			}

			if((numberOfElement+2)>=arrayWhereNeedToPut.length)
			{
				if(arrayWhichNeedToPut[i]>arrayWhereNeedToPut[numberOfElement+1])
					numberOfPlaceWhereNeedToPut[i]=numberOfElement+1;
				else
					numberOfPlaceWhereNeedToPut[i]=numberOfElement;
			}
		}
		return numberOfPlaceWhereNeedToPut;
	}
}
