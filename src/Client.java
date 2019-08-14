
public class Client {

	public static void main(String[] args) {
		System.out.println("BEGIN TESTING ADAPTER PATTERN");
		System.out.println("");
		
		SimpleBook book = new SimpleBook("Gamma, Helm, Johnson, and Vlissides", "Design Patterns");
		BookAdapter bookAdapter = new BookAdapter(book);
		System.out.println("Author and Title: " + bookAdapter.getAuthorAndTitle());
		System.out.println("");
		System.out.println("END TESTING ADAPTER PATTERN");
	}

}
