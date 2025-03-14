package itens;

public abstract class Usuario {
	private String nome;
	private String sexo;
	private int idade;
	
	public Usuario(){
		
	}
	
	public Usuario(String nome, String sexo, int idade) {
		this.setNome(nome);
		this.setSexo(sexo);
		this.setIdade(idade);
	}
	
	public Usuario(String nome, String sexo) {
		this.setNome(nome);
		this.setSexo(sexo);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	public String toString() {
		return "Sexo = " + sexo + "\nNome = " + nome + "\nIdade = " + idade;  
	}
}

