package mundo;
/*3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada
instância da classe Empregado tem, para além dos atributos que caracterizam a classe
Pessoa, os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto
(porcentagem retida dos impostos). Implemente a classe Empregado com métodos seletores
e modificadores e um método calcularSalario. Escreva um programa de teste adequado para
a classe Empregado*/
public class Empregado extends Pessoa{
	private int codigoSetor;
	private	double salarioBase;
	private double imposto;
	private double salarioFinal;
	
	public Empregado() {
		super();
		this.codigoSetor = 000;
		this.salarioBase = 000;
		this.imposto = 000;
	}

	public Empregado(String nome, String endereco, int telefone, int codigoSetor, double salarioBase, double imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		calcularSalario();
	}

	public Empregado(String nome, String endereco, int codigoSetor, double salarioBase) {
		super(nome, endereco);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = 00000;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}
	
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double getImposto() {
		return imposto;
	}
	
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
	public void calcularSalario(){
		 this.salarioFinal = salarioBase - (salarioBase * imposto/100);
	}
	

	public void setSalarioFinal(double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}

	public String toString() {
		return "\n\nEmpregado: \ncodigoSetor: " + codigoSetor + "\nsalarioBase: "
	+ salarioBase + "\nimposto: " + imposto + "\nSalarioFinal: " + salarioFinal + "\nSupertoString(): " + super.toString();
	}
	
}