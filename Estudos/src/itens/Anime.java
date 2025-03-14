package itens;

public class Anime extends Usuario{

	private String nAnime;
	private String studio;
	
	public Anime(String nome, String sexo, int idade) {
		super(nome, sexo, idade);
	}
	public Anime(String nome, String sexo, int idade, String nAnime, String studio) {
		super(nome, sexo, idade);
		this.setStudio(studio);
		this.setNAnime(nAnime);
	}
	public Anime(String nome, String sexo, int idade, String nAnime) {
		super(nome, sexo, idade);
		this.setNAnime(nAnime);
	}
	
	public String getNAnime() {
		return nAnime;
	}
	public String getStudio() {
		return studio;
	}
	public void setNAnime(String nAnime) {
		this.nAnime = nAnime;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}
	
	public String toString() {
		return "Studio = " + studio + "\nNome do Anime = " + nAnime + "\n" + super.toString();
	}
}
