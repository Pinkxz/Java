package model;

public class Animanga {
	private String name;
	private String release_date;
	private String finish_date;
	private String author;
	private String source;
	private float score;
	private String studio;
	
	public Animanga(String name, String release_date, String finish_date, String author, String source, float score,
			String studio) {
		super();
		this.setName(name);
		this.setRelease_date(release_date);
		this.setFinish_date(finish_date);
		this.setAuthor(author);
		this.setSource(source);
		this.setScore(score);
		this.setStudio(studio);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public String getFinish_date() {
		return finish_date;
	}
	public void setFinish_date(String finish_date) {
		this.finish_date = finish_date;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String getStudio() {
		return studio;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}

	@Override
	public String toString() {
		return "Animanga name = " + name + ", release_date = " + release_date + ", finish_date = " + finish_date
				+ ", author = " + author + ", source = " + source + ", score = " + score + ", studio = " + studio;
	}
	
	
}
