package model;

public class LoginModel {
	private String email;
	private String senha;
	
	public LoginModel(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}
	public LoginModel() {
		// TODO Auto-generated constructor stub
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
	
	public String toString() {
		return "LoginModel [email=" + email + ", senha=" + senha + "]";
	}
	
	
}
