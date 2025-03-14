package itens;

public class Manga extends Anime{
	private String author;
	
	public Manga(String nome, String sexo, int idade, String nAnime, String studio) {
		super(nome, sexo, idade, nAnime, studio);
	}
	public Manga(String nome, String sexo, int idade, String nAnime, String studio, String author) {
		super(nome, sexo, idade, nAnime, studio);
		this.setAuthor(author);
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String toString() {
		return super.toString() + "\nAutor = " + author;
	}
}
