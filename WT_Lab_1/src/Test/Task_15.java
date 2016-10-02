package Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

import Task_12_14_15.Book;

public class Task_15 {
	@Test
	public void test() {
		Map<Integer,Book> books=new HashMap<Integer,Book>();
		books.put(1, new Book("Java", "Shild", 312, 2));
		books.put(2, new Book("PHP", "test", 32, 2));
		books.put(3, new Book("SAO", "unknown", 1, 2));
		Random random=new Random();
		for(int i=1;i<=books.size();i++)
		{
			books.get(i).setIsbn(Math.abs(i-32));
		}
		int i=1;
		Book temp;
		while(i<books.size())
		{
			if((books.get(i).compareTo(books.get(i+1)))>=0)
			{
				temp=books.get(i);
				books.replace(i, books.get(i+1));
				books.replace(i+1, temp);
				i=0;
			}
			i++;
		}
		int[] orderByIsbnThatExpected={29,30,31};
		int[] orderByIsbnThatWeGot=new int[3];
		for(i=1;i<=books.size();i++)
		{
			orderByIsbnThatWeGot[i-1]=books.get(i).getIsbn();
		}
		Assert.assertArrayEquals(orderByIsbnThatExpected, orderByIsbnThatWeGot);
	}

}
