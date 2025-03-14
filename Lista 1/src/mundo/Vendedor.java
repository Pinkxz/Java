package mundo;
/*6. Implemente a classe Vendedor como subclasse da classe Empregado. Um determinado
vendedor tem como atributos, para além dos atributos da classe Pessoa e da classe
Empregado, o atributo valorVendas (correspondente ao valor monetário dos artigos
vendidos) e o atributo comissao (porcentagem do valorVendas que será adicionado ao
vencimento base do Vendedor). Note que deverá redefinir nesta subclasse o método herdado
calcularSalario (o salário de um vendedor é equivalente ao salário de um empregado usual
acrescido da referida comissão). Escreva um programa de teste adequado para esta classe*/

public class Vendedor extends Empregado {
		private double valorVendas;
		private double comissao;
		
		
		public Vendedor() {
			super();
		}
		
		public Vendedor(String nome, String endereco, int codigoSetor, double salarioBase, double valorVendas) {
			super(nome, endereco, codigoSetor, salarioBase);
			this.valorVendas = valorVendas;
			this.comissao = 00;
		}
		
		public Vendedor(String nome, String endereco, int telefone, int codigoSetor, double salarioBase,
				double imposto, double valorVendas, double comissao) {
			super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
			this.valorVendas = valorVendas;
			this.comissao = comissao;
			calcularSalario();
	   }
		
	    public double getValorVendas() {
	        return valorVendas;
	    }

	    public void setValorVendas(double valorVendas) {
	        this.valorVendas = valorVendas;
	        calcularSalario(); // Recalcula o salário com o novo valor de vendas
	    }

	    public double getComissao() {
	        return comissao;
	    }

	    public void setComissao(double comissao) {
	        this.comissao = comissao;
	        calcularSalario(); // Recalcula o salário com a nova comissão
	    }

	  //  @Override
	    public void calcularSalario() {
	        // O salário de um vendedor é o salário base + (valorVendas * comissao) - imposto
	        double salarioFinal = getSalarioBase() + (valorVendas * comissao) - (getSalarioBase() * getImposto() / 100);
	        setSalarioFinal(salarioFinal);
	    }

	   // @Override
	    public String toString() {
	        return "\nVendedor"+super.toString() + "\nValor de Vendas: " + valorVendas + "\nComissão: " + comissao;
	    }
		
		
}