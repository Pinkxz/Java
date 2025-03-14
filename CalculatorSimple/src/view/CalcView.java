package view;
import java.awt.Container;
import java.awt.HeadlessException;

import javax.swing.*;

import controller.CalcController;

public class CalcView extends JFrame{
	
		private Container container;
		private JButton num0;
		private JButton num1;
		private JButton num2;
		private JButton num3;
		private JButton num4;
		private JButton num5;
		private JButton num6;
		private JButton num7;
		private JButton num8;
		private JButton num9;
		private JButton igual;
		private JButton soma;
		private JTextField display;
		
		public CalcView() throws HeadlessException {
			super();
			
			setTitle("CalculadoraSimples");
			setBounds(600, 240, 450, 450);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setResizable(false);
			
			container = getContentPane();
			container.setLayout(null);
			
			display = new JTextField();
			display.setText("");
			display.setBounds(0, 20, 65, 65);
			display.setEditable(false);
			container.add(display);
			
			num7 = new JButton();
	        num7.setText("7");
	        num7.setBounds(0, 120, 65, 65);
	        container.add(num7);
	        
	        num4 = new JButton();
	        num4.setText("4");
	        num4.setBounds(0, 190, 65, 65);
	        container.add(num4);
	        
	        num1 = new JButton();
	        num1.setText("1");
	        num1.setBounds(0, 260, 65, 65);
	        container.add(num1);
	        
	        num0 = new JButton();
	        num0.setText("0");
	        num0.setBounds(0, 330, 65, 65);
	        container.add(num0);
	        
	        //FAIXA 02
	        num8 = new JButton();
	        num8.setText("8");
	        num8.setBounds(70, 120, 65, 65);
	        container.add(num8);
	        
	        num5 = new JButton();
	        num5.setText("5");
	        num5.setBounds(70, 190, 65, 65);
	        container.add(num5);
	        
	        num2 = new JButton();
	        num2.setText("2");
	        num2.setBounds(70, 260, 65, 65);
	        container.add(num2);
	 
	        
	        //FAIXA 03
	        num9 = new JButton();
	        num9.setText("9");
	        num9.setBounds(140, 120, 65, 65);
	        container.add(num9);
	        
	        num6 = new JButton();
	        num6.setText("6");
	        num6.setBounds(140, 190, 65, 65);
	        container.add(num6);
	        
	        num3 = new JButton();
	        num3.setText("3");
	        num3.setBounds(140, 260, 65, 65);
	        container.add(num3);
	        
	        soma = new JButton("+");
	        soma.setBounds(140, 330, 65, 65);
	        container.add(soma);
	        
	        igual = new JButton("=");
	        igual.setBounds(210, 330, 65, 65);
	        container.add(igual);
	        
	        setVisible(true);
		}
		
		public void setListeners(CalcController Listener) {
			num0.addActionListener(Listener);
			num1.addActionListener(Listener);
			num2.addActionListener(Listener);
			num3.addActionListener(Listener);
			num4.addActionListener(Listener);
			num5.addActionListener(Listener);
			num6.addActionListener(Listener);
			num7.addActionListener(Listener);
			num8.addActionListener(Listener);
			num9.addActionListener(Listener);
			soma.addActionListener(Listener);
			igual.addActionListener(Listener);
		}
		
		public void atualizaDisplay(String value) {
			display.setText(value);
		}

		public String getDisplay() {
			return display.getText();
		}
		
		public void LimpaDisplay() {
			display.setText("");
		}
		
		
		
}
