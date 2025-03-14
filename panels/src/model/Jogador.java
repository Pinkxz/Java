package model;

public class Jogador {
	private String nome;

	public Jogador(String nome) {
		super();
		this.setNome(nome);
	}

	public Jogador() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override 
	public String toString() {
		return "Jogador [nome=" + nome + "]";
	}
	
	
}
