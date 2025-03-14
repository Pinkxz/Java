package model;

public class FabricadeAnime {

	public Animanga getAnimanga(String name, String release_date, String finish_date, String author, String source, String studio) {
		Animanga retorno = null;
			if(name != null && release_date != null && finish_date != null && author != null && source != null && studio != null) {
				retorno = new Animanga(name, release_date, finish_date, author, source, 0, studio);
			}else {
				
			}
		return retorno;
	}
}
