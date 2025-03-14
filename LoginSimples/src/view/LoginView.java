package view;

import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.*;

import controller.LoginController;

public class LoginView extends JFrame {

	private Container container;
	private JTextField email;
	private JPasswordField senha;
	private JTextField display;
	private JButton botao;
	
	
	public LoginView(){
		super();
		
		setTitle("LoginFoda");
		setBounds(600, 240, 550, 550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		container = getContentPane();
		container.setLayout(null);
		
	email = new JTextField();
	email.setFont(new Font("Arial", Font.PLAIN, 25));
	email.setSize(300, 30);
	email.setLocation(14, 14);
	container.add(email);
	
	
	senha = new JPasswordField();
	senha.setFont(new Font("Arial", Font.PLAIN, 25));
	senha.setSize(300, 30);
	senha.setLocation(100, 100);
	container.add(senha);
	
	display = new JTextField(" ");
	display.setFont(new Font("Arial", Font.PLAIN, 25));
	display.setSize(300, 30);
	display.setLocation(150, 150);
	display.setEditable(false);
	container.add(display);
	
	botao = new JButton("Confirmar");
	botao.setFont(new Font("Arial", Font.PLAIN, 25));
	botao.setSize(300, 30);
	botao.setLocation(300, 300);
	container.add(botao);
	
	
	setVisible(true);
	
	}
	
	
	public JTextField getEmail() {
		return email;
	}


	public void setEmail(JTextField email) {
		this.email = email;
	}


	public JPasswordField getSenha() {
		return senha;
	}


	public void setSenha(JPasswordField senha) {
		this.senha = senha;
	}


	public void atualizarDisplay(String email, String senha) {
		display.setText("Email: " + email + "Senha: " + senha);
	}

	public void setListeners(LoginController loginController) {
		// TODO Auto-generated method stub
		botao.addActionListener(loginController);
		
	}
}

