package view;

import java.util.*;  
import javax.swing.*;

import java.awt.*;
import model.*;
import controller.*;

@SuppressWarnings("serial")
public class JogaView extends JFrame{

	
	private Container container;
	private JLabel txt;
	private JTextField insira;
	private JButton botao;
	
	
	public JogaView() {
		super();
		 
		setTitle("Nomes");
		setBounds(600, 240, 350, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		container = getContentPane();
		container.setLayout(null);
		
		txt = new JLabel("Insira o nome dos jogadores");
		txt.setFont(new Font("Arial", Font.PLAIN,25));
		txt.setSize(300,30);
		txt.setLocation(20,14);
		container.add(txt);
		
		insira = new JTextField();
		insira.setFont(new Font("Arial", Font.PLAIN, 25));
		insira.setSize(300, 30);
		insira.setLocation(14, 40);
		container.add(insira);
		
		botao = new JButton("Inserir");
		botao.setFont(new Font("Arial", Font.PLAIN, 25));
		botao.setSize(300, 30);
		botao.setLocation(18, 170);
		container.add(botao);
		setVisible(true);
	}
	
	public void setListeners(JogaControl listener) {
		this.botao.addActionListener(listener);
	}
	
	public String getNome() {
		return this.insira.getText();
	}
	
}
