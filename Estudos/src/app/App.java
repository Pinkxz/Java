package app;
import itens.Anime;
import itens.Manga;

public class App {
	public static void main(String[] args) {
	
		Anime ani = new Anime("NomeFoda", "SexoFoda", 69, "YuriFoda", "StudioFoda");
		System.out.println(ani);
		Manga Man = new Manga("NomePaia", "SexoPaia", 96, "YaoiPaia", "StudioPaia", "AutorPaia");
		System.out.println(Man);
	}
}
