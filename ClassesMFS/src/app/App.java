package app;

import model.*;


public class App {
	public static void main(String[] args) {
		FabricadeAnime fabricaDeAnime = new FabricadeAnime();
		FabricadeFilm fabricaDefilme = new FabricadeFilm();
		FabricadeGames fabricaDeGames = new FabricadeGames();
		FabricadeReview fabricadeReview = new FabricadeReview();
		
		String name = "Sousou no Friren";
		String release_date = "08/10/23";
		String finish_date = "20/12/23";
		String author = "zap zap no mi";
		String source = "crunchyroll";
		String studio = "wit";
		
		
		String frelease_date = "02/02/2321"; 
		String director = "Shinbou";
		String synopse = "O protagonista buscsa sexo";
		String fname = "O sexudo";
		
		String gsynopse = "O protagonista falece";
	    String empresa = "Rockstar";
	    String gname = "jogo foda";
	    
	    String rauthor = "sexo";
	    String title = "busca de sexo";
	    String text = "sdgSFUDIHGAYUIHDFBHNJIASDBNFHJIKAN DFJIHNAJIODFNHIAJDNFHJIOADFHJIKNADJIOHNAJIODN H JIOADNFHIJNADJIHNUAJIDFHNJIOAXFNHJIOA";
		
		Animanga anime = (Animanga)fabricaDeAnime.getAnimanga(name, release_date,finish_date,author,source, studio);
		Film filme = (Film)fabricaDefilme.getFilm(release_date, director, synopse, fname, 0);
		Games game = (Games)fabricaDeGames.getGames(gsynopse, empresa, gname);
		Review reviw = (Review)fabricadeReview.getReview(rauthor, title, text);
		System.out.println(anime);
		System.out.println(filme);
		System.out.println(game);
		System.out.println(reviw);
	}
}
