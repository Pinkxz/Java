package model;

public class CalcModel {
	private double soperando;
	private double operando;
	private double resultado;
	private String operacao;
	
	public CalcModel(double soperando, double operando, double resultado, String operacao) {
		super();
		this.setSoperando(soperando);
		this.setOperando(operando);
		this.setResultado(resultado);
		this.setOperacao(operacao);
	}

	public CalcModel() {
		super();
	}

	public double getSoperando() {
		return soperando;
	}

	public void setSoperando(double soperando) {
		this.soperando = operando;
	}

	public double getOperando() {
		return operando;
	}

	public void setOperando(double operando) {
		this.operando = operando;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public String toString() {
		return "CalcModel [Soperando=" + soperando + ", operando=" + operando + ", resultado=" + resultado + "]";
	}
	
}
