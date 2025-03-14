package controler;

import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;

import model.LoginModel;
import view.LoginView;

public class LoginController implements ActionListener {
	
	private LoginModel model;
	private LoginView view;
	
	public LoginController(LoginModel model, LoginView view) {
		this.model = model;
		this.view = view;
		view.setListeners(this);
	}
	
	public void actionPerformed(ActionEvent event) {
		String comando = event.getActionCommand();
		
		if (comando == "Confirmar") {
			model.setLogin(view.getCadastro(), view.getSenha());
			model.getLogin();
		}
		
	}
	
}
