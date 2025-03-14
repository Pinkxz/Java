package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.*;
import view.*;

public class LoginController implements ActionListener {
	private LoginModel model;
	private LoginView view;
	
	public LoginController(LoginModel model, LoginView view) {
		super();
		this.model = model;
		this.view = view;
		view.setListeners(this);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String comando = event.getActionCommand();

		if ("confirmar".equals(comando)) {
			model.setEmail(view.getEmail());
			model.setAnoNasc(Double.parseDouble(view.getAnoNasc()));
			model.setIdade(Double.parseDouble(view.getIdade()));
			model.setSenha(view.getSenha());
			
			boolean resultado = model.calculaIdade(model.getIdade(), model.getAnoNasc());
			
			view.atualizaDisplay(model.getEmail(), model.getSenha(), resultado);
		}
	}
	
	
}
