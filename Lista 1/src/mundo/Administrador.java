package mundo;
/*4- Implemente a classe Administrador como subclasse da classe Empregado. Um
determinado administrador tem como atributos, para além dos atributos da classe Pessoa e
da classe Empregado, o atributo ajudaDeCusto (ajudas referentes a viagens, estadias, ...).
Note que deverá redefinir na classe Administrador o método herdado calcularSalario (o
salário de um administrador é equivalente ao salário de um empregado usual acrescido das
ajuda de custo). Escreva um programa de teste adequado para esta classe.*/

public class Administrador extends Empregado {
	
	private double ajudaDeCusto;

	
	public Administrador() {
		super();
	}

	public Administrador(String nome, String endereco, int codigoSetor, double salarioBase, double ajudaDeCusto) {
		super(nome, endereco, codigoSetor, salarioBase);
		this.ajudaDeCusto = ajudaDeCusto;
		calcularSalario();

	}

	public Administrador(String nome, String endereco, int telefone, int codigoSetor, double salarioBase,
			double imposto, double ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
		calcularSalario();
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	//@Override
	public void calcularSalario() {
	     double salarioFinal = getSalarioBase() + ajudaDeCusto - (getSalarioBase() * getImposto() / 100);
	     setSalarioFinal(salarioFinal);
	}
	//@Override
    public String toString() {
        return "\nAdministrador" + super.toString() + "\nAjuda de Custo: " + ajudaDeCusto;
    }

}