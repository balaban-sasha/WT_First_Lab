package Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import Task_12_14_15.Book;
import Task_16.AuthorAndTitleComparator;
import Task_16.AuthorTitlePriceComparator;
import Task_16.TitleAndAuthorComparator;
import Task_16.TitleComparator;

public class Task_16 {

	@Test
	public void sortByTitle() {
		Map<Integer,Book> books=new HashMap<Integer,Book>();
		books.put(1, new Book("Java", "Shild", 312, 2));
		books.put(2, new Book("PHP", "test", 32, 2));
		books.put(3, new Book("AAO", "unknown", 1, 2));
		books.put(4, new Book("ASO", "unknown", 1, 2));
		int i=1;
		Book temp;
		TitleComparator titleComparator=new TitleComparator();
		
		while(i<books.size())
		{
			if(titleComparator.compare(books.get(i), books.get(i+1))>=0)
			{
				temp=books.get(i);
				books.replace(i, books.get(i+1));
				books.replace(i+1, temp);
				i=0;
			}
			i++;
		}
		assertEquals("AAO",books.get(1).getTitle());
		assertEquals("ASO",books.get(2).getTitle());
		assertEquals("Java",books.get(3).getTitle());
		assertEquals("PHP",books.get(4).getTitle());
	}

	@Test
	public void sortByTitleAndAuthor() {
		Map<Integer,Book> books=new HashMap<Integer,Book>();
		books.put(1, new Book("Java", "Shild", 312, 2));
		books.put(2, new Book("PHP", "test", 32, 2));
		books.put(3, new Book("AAO", "unknown", 1, 2));
		books.put(4, new Book("ASO", "unknown", 1, 2));
		books.put(5, new Book("AAO", "Aug", 1, 2));
		books.put(6, new Book("AAO", "Azc", 1, 2));
		int i=1;
		Book temp;
		TitleAndAuthorComparator titleAndAuthorComparator=new TitleAndAuthorComparator();
		
		while(i<books.size())
		{
			if(titleAndAuthorComparator.compare(books.get(i), books.get(i+1))>=0)
			{
				temp=books.get(i);
				books.replace(i, books.get(i+1));
				books.replace(i+1, temp);
				i=0;
			}
			i++;
		}
		assertEquals("Aug",books.get(1).getAuthor());
		assertEquals("Azc",books.get(2).getAuthor());
		assertEquals("unknown",books.get(3).getAuthor());
		assertEquals("unknown",books.get(4).getAuthor());
		assertEquals("Shild",books.get(5).getAuthor());
		assertEquals("test",books.get(6).getAuthor());
	}
	@Test
	public void sortByAuthorAndTitle() {
		Map<Integer,Book> books=new HashMap<Integer,Book>();
		books.put(1, new Book("Java", "Shild", 312, 2));
		books.put(2, new Book("PHP", "test", 32, 2));
		books.put(3, new Book("AAO", "unknown", 1, 2));
		books.put(4, new Book("ASO", "unknown", 1, 2));
		books.put(5, new Book("AAO", "Aug", 1, 2));
		books.put(6, new Book("AAO", "Azc", 1, 2));
		int i=1;
		Book temp;
		AuthorAndTitleComparator authorAndTitleComparator=new AuthorAndTitleComparator();
		
		while(i<books.size())
		{
			if(authorAndTitleComparator.compare(books.get(i), books.get(i+1))>=0)
			{
				temp=books.get(i);
				books.replace(i, books.get(i+1));
				books.replace(i+1, temp);
				i=0;
			}
			i++;
		}
		assertEquals("Aug",books.get(1).getAuthor());
		assertEquals("Azc",books.get(2).getAuthor());
		assertEquals("Shild",books.get(3).getAuthor());
		assertEquals("test",books.get(4).getAuthor());
		assertEquals("unknown",books.get(5).getAuthor());
		assertEquals("unknown",books.get(6).getAuthor());
	}

	@Test
	public void sortByAuthorTitlePrice() {
		Map<Integer,Book> books=new HashMap<Integer,Book>();
		books.put(1, new Book("Java", "Shild", 312, 2));
		books.put(2, new Book("PHP", "test", 32, 2));
		books.put(3, new Book("AAO", "unknown", 10, 2));
		books.put(4, new Book("ASO", "unknown", 1, 2));
		books.put(5, new Book("AAO", "unknown", 1, 2));
		books.put(6, new Book("AAO", "Azc", 1, 2));
		int i=1;
		Book temp;
		AuthorTitlePriceComparator authorTitlePriceComparator=new AuthorTitlePriceComparator();
		
		while(i<books.size())
		{
			if(authorTitlePriceComparator.compare(books.get(i), books.get(i+1))>=0)
			{
				temp=books.get(i);
				books.replace(i, books.get(i+1));
				books.replace(i+1, temp);
				i=0;
			}
			i++;
		}
		assertEquals("Azc",books.get(1).getAuthor());
		assertEquals("unknown",books.get(2).getAuthor());
		assertEquals(1,books.get(2).getPrice());
		assertEquals("unknown",books.get(3).getAuthor());
		assertEquals(10,books.get(3).getPrice());
		assertEquals("unknown",books.get(4).getAuthor());
		assertEquals("Shild",books.get(5).getAuthor());
		assertEquals("test",books.get(6).getAuthor());
	}
}
