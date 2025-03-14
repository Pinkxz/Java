package mundo;

/*Exercicios POO – Herança, Construtores , Métodos Seletores.
1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos
seletores (getters) e modificadores (setters), e ainda o construtor padrão e, pelo menos, mais
duas opções de construtores conforme sua percepção. Atributos: String nome; String
endereço; String telefone*/

public class Pessoa {


	private String nome; 
	private String endereco;
	private int telefone;
	
	
	public Pessoa() {
		this.nome =  null;
		this.endereco = null;
		this.telefone =  0;
	}
	
	public Pessoa(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = 00000000000;
		
	}
	public Pessoa(String nome, String endereco, int telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String toString() {
		return "\nPessoa nome: " + nome + "\nendereco: " + endereco + "\ntelefone: " + telefone 
				+ "\ntoString(): " + super.toString() ;
	}
} 