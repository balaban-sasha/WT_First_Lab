package Task_12_14_15;

public class Book {  
	private String title;  
	private String author;  
	private int price;  
	private static int edition; 
	private volatile int hashCode;
	private int isbn;
	public Book(String title,String author,int price,int edition)
	{
		this.title=title;
		this.author=author;
		this.price=price;
		this.edition=edition;
	}
	@Override
	public boolean equals(Object o)
	{
		if(o==this)
			return true;
		if(!(o instanceof Book))
			return false;
		Book book=(Book)o;
		return book.title==title&&book.author==author&&
				book.price==price&&book.edition==edition;
	}
	public String getTitle()
	{
		return this.title;
	}
	public void setIsbn(int isbn)
	{
		if(isbn<0)
			System.out.println("The argument can't be <0");
		else
			this.isbn=isbn;
	}
	public int getIsbn()
	{
		return this.isbn;
	}
	@Override
	public int hashCode()
	{
		int result=hashCode;
		if(hashCode==0)
		{
			result=17;
			result=31+result+((title == null) ? 0 : title.hashCode());
			result=31+result+((author == null) ? 0 : author.hashCode());
			result=31+result+price;
			result=31+result+edition;
			hashCode=result;
		}
		return result;
	}
	@Override
	public String toString()
	{
		return "[Название="+title+", Автор="+author+", Цена="+price+", Издание="+edition+"]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public int compareTo(Book o)
	{
		return(isbn - o.getIsbn());
	}
	public String getAuthor() {
		return this.author;
	}
	public int getPrice() {
		return this.price;
	}
}