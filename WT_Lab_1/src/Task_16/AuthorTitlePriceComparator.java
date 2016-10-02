package Task_16;

import Task_12_14_15.Book;

public class AuthorTitlePriceComparator extends TitleAndAuthorComparator {

	public int compare(Book  o,Book o2)
	{
		int resultOfCompare=super.compare(o, o2);
		if(resultOfCompare==0)
		{
			if(o.getPrice()==o2.getPrice())
				return 0;
			else
				if(o.getPrice()<o2.getPrice())
					return -1;
				else
					return 1;
		}
		else
			return resultOfCompare;
	}
}
