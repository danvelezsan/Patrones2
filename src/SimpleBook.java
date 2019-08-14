
public class SimpleBook {

    private String author;
    private String title;
    
	public SimpleBook(String author_in, String title_in) {
		this.author = author_in;
		this.title = title_in;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getTitle() {
		return this.title;
	}

}
