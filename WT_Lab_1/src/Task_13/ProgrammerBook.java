package Task_13;

import Task_12_14_15.Book;

public class ProgrammerBook extends Book {
	public ProgrammerBook(String title, String author, int price, int edition) {
		super(title, author, price, edition);
	}
	private String language;  
	private int level;
	@Override
	public String toString() {
		return "ProgrammerBook [язык=" + language + ", ”ровень=" + level
				+ ", Book=" + super.toString() +"]";
	}
	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + ((language == null) ? 0 : language.hashCode());
		result = 31 * result + level;
		return result;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!super.equals(o)) {
			return false;
		}
		if (!(o instanceof ProgrammerBook)) {
			return false;
		}
		ProgrammerBook progBook = (ProgrammerBook) o;
		return progBook.level==level&&progBook.language==language;
	}
	
}
