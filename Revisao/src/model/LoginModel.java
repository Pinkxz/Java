package model;

public class LoginModel {
	private String email;
	private String senha;
	private double idade;
	private double anoNasc;

	
	public LoginModel(String email, String senha, int idade, int anoNasc) {
		super();
		this.email = email;
		this.senha = senha;
		this.idade = idade;
		this.anoNasc = anoNasc;
	}

	public LoginModel() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getIdade() {
		return idade;
	}

	public void setIdade(double idade) {
		this.idade = idade;
	}

	public double getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(double anoNasc) {
		this.anoNasc = anoNasc;
	}

	
	public boolean calculaIdade(double idade, double anoNasc) {
		if(idade == 2023 - anoNasc) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "LoginModel [email=" + email + ", senha=" + senha + ", idade=" + idade + ", anoNasc=" + anoNasc + "]";
	}
	
	
}
