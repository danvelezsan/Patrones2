
public class BookAdapter {

	SimpleBook book;
	public BookAdapter(SimpleBook book_in) {
		this.book = book_in;
	}
	
	public String getAuthorAndTitle() {
		return this.book.getTitle() + " by " + this.book.getAuthor();
	}

}
