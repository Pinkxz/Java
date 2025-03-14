package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CalcModel;
import view.CalcView;

public class CalcController implements ActionListener {
    private CalcModel model;
    private CalcView view;

    public CalcController(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;
        view.setListeners(this);
    }

    public void actionPerformed(ActionEvent event) {
        String comando = event.getActionCommand();
        if (isNumero(comando)) {
            // Faça algo se for um número, se necessário.
        }

        if ("+".equals(comando)) {
            String displayText = view.getDisplay();
            if (!displayText.isEmpty()) {
                model.setOperando(Double.parseDouble(displayText));
                view.LimpaDisplay();
            }
        } else if ("=".equals(comando)) {
            String displayText = view.getDisplay();
            if (!displayText.isEmpty()) {
                model.setSoperando(Double.parseDouble(displayText));
                soma(model.getOperando(), model.getSoperando());
            }
        }
    }

    public void soma(double operando, double soperando) {
        model.setResultado(operando + soperando);
        view.atualizaDisplay(String.valueOf(model.getResultado()));
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
