package 도서관;

public class Book {

	private String title;
	private String author;
	private boolean isRent;
	
	public Book() {
		
	}

	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String print2() {
		String str = "";
		if(isRent() == true) {
			str = " / 대여중";
		}
		
		return getTitle() + " / " + getAuthor() + str;
	}



	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isRent() {
		return isRent;
	}
	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}
	
	
	
	
}
