package view;
import javax.swing.*;

import controller.LoginController;

import java.awt.*;

public class LoginView extends JFrame{
	
		private Container container;
		private JTextField email;
		private JPasswordField senha;
		private JTextField idade;
		private JTextField display;
		private JTextField anoNasc;
		private JButton confirmar;
		
		
		public LoginView() throws HeadlessException {
			super();
			
			setTitle("LoginSimples2");
			setBounds(600, 240, 550, 550);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setResizable(false);
			
			container = getContentPane();
			container.setLayout(null);
			
			
			email = new JTextField();
			email.setSize(300, 30);
			email.setLocation(0, 0);
			container.add(email);
			
			senha = new JPasswordField();
			senha.setSize(300, 30);
			senha.setLocation(0, 100);
			container.add(senha);
			
			idade = new JTextField("");
			idade.setSize(300, 30);
			idade.setLocation(0, 180);
			container.add(idade);
			
			anoNasc = new JTextField("");
			anoNasc.setSize(300, 30);
			anoNasc.setLocation(0, 235);
			container.add(anoNasc);

			confirmar = new JButton("confirmar");
			confirmar.setSize(300, 30);
			confirmar.setLocation(0, 300);
			container.add(confirmar);
			
			display = new JTextField("");
			display.setFont(new Font("Arial", Font.PLAIN, 25));
		//	display.setEditable(false);
			display.setSize(300, 30);
			display.setLocation(0,370);
			container.add(display);
			
			setVisible(true);
			
		}
		
		public String getEmail() {
			return email.getText();
		}

		public String getSenha() {
			return senha.getText();
		}


		public String getIdade() {
			return idade.getText();
		}


		public String getDisplay() {
			return display.getText();
		}


		public String getAnoNasc() {
			return anoNasc.getText();
		}


		public void atualizaDisplay(String email, String senha, boolean verdadeOuFalso) {
			if(verdadeOuFalso == true) {
				display.setText("Email: " + email + " Senha: " + senha + " Idade ou ano de nascimento corretos");
			}else {
				display.setText("Email: " + email + " Senha: " + senha + " Idade ou ano de nascimento incorretos");
			}
		}

		public void setListeners(LoginController loginController) {
			confirmar.addActionListener(loginController);
			
		}
}
