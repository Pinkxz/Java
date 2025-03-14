package model;

public class FabricadeFilm {

	public Film getFilm(String frelease_date, String director, String synopse, String name, float score) {
		Film retorno = null;
		if(name != null && frelease_date != null && director != null && synopse != null && name != null) {
			retorno = new Film(frelease_date, director, synopse, name, 0);
		}else {
			
		}
		return retorno;
	}
}
