package view;

import javax.swing.*;
import java.awt.*;
import controller.CalculadoraController;

@SuppressWarnings("serial")
public class CalculadoraView extends JFrame {

    private JTextField display;
    private JButton[] numeros;
    private JButton[] operacoes;

    public CalculadoraView() {
        super("Calculadora");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        display = new JTextField();
        display.setEditable(false);
        panel.add(display);

        numeros = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = new JButton(String.valueOf(i));
            panel.add(numeros[i]);
        }

        operacoes = new JButton[]{
            new JButton("+"),
            new JButton("-"),
            new JButton("*"),
            new JButton("/"),
            new JButton("=")
        };

        for (JButton operacao : operacoes) {
            panel.add(operacao);
        }

        add(panel);

        setSize(300, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setListener(CalculadoraController listener) {
        for (JButton numero : numeros) {
            numero.addActionListener(listener);
        }

        for (JButton operacao : operacoes) {
            operacao.addActionListener(listener);
        }
    }

    public String getDisplay() {
        return display.getText();
    }

    public void atualizarDisplay(String value) {
        display.setText(value);
    }

    public void limparDisplay() {
        display.setText("");
    }

}
