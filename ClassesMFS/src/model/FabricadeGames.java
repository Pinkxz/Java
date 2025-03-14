package model;

public class FabricadeGames {

	public Games getGames(String gsynopse, String empresa, String gname) {
		Games retorno = null;
		if(gsynopse != null && empresa != null && gname != null) {
			retorno = new Games(gsynopse, empresa, gname, 0);
		}else {
			
		}
		return retorno;
	}
}

