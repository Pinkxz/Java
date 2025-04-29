package model;

public class FabricadeItens {
	
	    public ItemComum getItemComum(int numSeque, int idNum, String descricao, String detalhe1, String detalhe2) {
	    	ItemComum retorno = null;
	    	if(descricao != null && detalhe1 != null && detalhe2 != null) {
	    		retorno = new ItemComum(numSeque, idNum, descricao, detalhe1, detalhe2);
	    	}
			return retorno;
	    }
	    
	    public ItemRaro getItemRaro(int numSeque, int idNum, String descricao, String detalhe1, String detalhe2, String detalhe3) {
	    	ItemRaro retorn = null;
	    	if(descricao != null && detalhe1 != null && detalhe2 != null && detalhe3 != null) {
	    		retorn = new ItemRaro(numSeque, idNum, descricao, detalhe1, detalhe2, detalhe3);
	    	}
			return retorn;
	    }
	}

