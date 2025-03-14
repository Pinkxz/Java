package controller;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.JButton;
import model.CalculadoraModel;
import view.CalculadoraView;

public class CalculadoraController implements ActionListener {
    private CalculadoraModel model;
    private CalculadoraView view;

    public CalculadoraController(CalculadoraModel model, CalculadoraView view) {
        this.model = model;
        this.view = view;
        this.view.setListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String comando = ((JButton) event.getSource()).getText();

        if (isNumero(comando)) {
            if (view.getDisplay().equals("0")) {
                view.limparDisplay();
            }
            view.atualizarDisplay(view.getDisplay() + comando);
        } else if (comando.equals("+") || comando.equals("-") || comando.equals("*") || comando.equals("/")) {
            model.setOperando(Double.parseDouble(view.getDisplay()));
            model.setOperacao(comando);
            view.limparDisplay();
        } else if (comando.equals("=")) {
            model.setSoperando(Double.parseDouble(view.getDisplay()));
            realizarOperacao(model.getOperando(), model.getSoperando(), model.getOperacao());
        }
    }

    private void realizarOperacao(double primeiroOperando, double segundoOperando, String operacao) {
        switch (operacao) {
            case "+":
                model.setResultado(primeiroOperando + segundoOperando);
                break;
            case "-":
                model.setResultado(primeiroOperando - segundoOperando);
                break;
            case "*":
                model.setResultado(primeiroOperando * segundoOperando);
                break;
            case "/":
                if (segundoOperando != 0) {
                    model.setResultado(primeiroOperando / segundoOperando);
                } else {
                    view.atualizarDisplay("Erro");
                    return;
                }
                break;
        }

        view.atualizarDisplay(String.valueOf(model.getResultado()));
    }

    private boolean isNumero(String str) {
        try {
            double num = Double.parseDouble(str);
            return num >= 0 && num <= 100;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}



