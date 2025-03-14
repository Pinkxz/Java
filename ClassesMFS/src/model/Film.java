package model;

public class Film {

	private String frelease_date;
	private String director;
	private String synopse;
	private String fname;
	private float score;
	
	public Film(String frelease_date, String director, String synopse, String name, float score) {
		super();
		this.setFrelease_date(frelease_date);
		this.setDirector(director);
		this.setSynopse(synopse);
		this.setFname(fname);
		this.setScore(score);
	}

	public String getFrelease_date() {
		return frelease_date;
	}

	public void setFrelease_date(String frelease_date) {
		this.frelease_date = frelease_date;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getSynopse() {
		return synopse;
	}

	public void setSynopse(String synopse) {
		this.synopse = synopse;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String name) {
		this.fname = name;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Film release_date = " + frelease_date + ", director = " + director + ", synopse = " + synopse + ", name = "
				+ fname + ", score = " + score;
	}
	
	
	
}
