
public class Book {
	private int author;
	private String title;

	private int getAuthor() {
		return author;
	}

	private void setAuthor(int author) {
		this.author = author;
	}

	private String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		this.title = title;
	}
}

class BookTest {
	public static void main(String[] args) {
		Book scan = new Book();
		scan.getClass();
		 
	}
}