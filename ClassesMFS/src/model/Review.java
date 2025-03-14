package model;

public class Review {
	private String rauthor;
	private String title;
	private String text;
	public Review(String rauthor, String title, String text) {
		super();
		this.setRauthor(rauthor);
		this.setTitle(title);
		this.setText(text);
	}
	public String getRauthor() {
		return rauthor;
	}
	public void setRauthor(String author) {
		this.rauthor = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Review author = " + rauthor + ", title = " + title + ", text = " + text;
	}
	
	
}
