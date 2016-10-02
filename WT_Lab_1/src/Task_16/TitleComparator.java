package Task_16;

import Task_12_14_15.Book;

public class TitleComparator {
	public int compare(Book o,Book o2)
	{
		return o.getTitle().compareTo(o2.getTitle());
	}
}
