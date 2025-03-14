package controller;
import java.util.* ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;
import view.*;

public class JogaControl implements ActionListener {	
	private Jogador model;
	private JogaView view;
	
	
	public JogaControl(Jogador model, JogaView view) {
		this.model = model;
		this.view = view;
		view.setListeners(this);
	}

	public void actionPerformed(ActionEvent event) {
		String comando = event.getActionCommand();
		
		if (comando == "Inserir") {
			model.setNome(view.getNome());
			System.out.println(model);
		}
		
	}
}
