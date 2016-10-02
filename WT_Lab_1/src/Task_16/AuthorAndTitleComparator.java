package Task_16;

import Task_12_14_15.Book;

public class AuthorAndTitleComparator extends TitleComparator{
	public int compare(Book  o,Book o2)
	{
		int resultOfFirstCompare = o.getAuthor().compareTo(o2.getAuthor());
		if(resultOfFirstCompare==0)
		{
			return super.compare(o, o2);
		}
		else
			return resultOfFirstCompare;
	}
}