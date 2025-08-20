package testree;
import java.util.*;

public class Book implements Comparable<Book> {
		private String title;

	public Book(String t) {
		this.title = t;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public int compareTo(Book other) {
		return this.title.compareTo(other.title);
	}

	@Override
	public String toString() {
		return "Book{" + "title='" + title + '\'' + '}';
	}
	
	@Override
	public boolean equals(Object o) {
		Book other = (Book) o;
		if(this.getTitle().equals(other.getTitle())) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return this.getTitle().hashCode();
	}
}
