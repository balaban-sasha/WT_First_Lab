package Task_16;

import Task_12_14_15.Book;

public class TitleAndAuthorComparator extends TitleComparator{
	public int compare(Book  o,Book o2)
	{
		int resultOfFirstCompare = super.compare(o, o2);
		if(resultOfFirstCompare==0)
		{
			return o.getAuthor().compareTo(o2.getAuthor());
		}
		else
			return resultOfFirstCompare;
	}
}
