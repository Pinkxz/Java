package model;

public class FabricadeReview {
	
	public Review getReview(String author, String title, String text) {
		Review retorno = null;
		if(author != null && title != null && text != null) {
			retorno = new Review(author, title, text);
		}else {
			
		}
		return retorno;
	}
	
}
