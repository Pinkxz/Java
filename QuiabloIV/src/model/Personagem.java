package model;
import java.util.List;
public class Personagem {
	private List<Itens> cinto;

	public Personagem(List<Itens> cinto) {
		super();
		this.setCinto(cinto);
	}
  
	public List<Itens> getCinto() {
		return cinto;
	}

	public void setCinto(List<Itens> cinto) {
		this.cinto = cinto;
	}
	
	
}
