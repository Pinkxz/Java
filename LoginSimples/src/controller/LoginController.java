package controller;

import model.LoginModel;
import view.LoginView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController implements ActionListener{
	private LoginModel model;
	private LoginView view;
	

	public LoginController(LoginModel model, LoginView view) {
		super();
		this.model = model;
		this.view = view;
		view.setListeners(this);
	}


	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		String comando = event.getActionCommand();
		
		if(comando == "Confirmar") {
			model.setEmail(view.getEmail().getText());
			model.setSenha(new String(view.getSenha().getPassword()));
			view.atualizarDisplay(model.getEmail(), model.getSenha());
		}
	}

}
