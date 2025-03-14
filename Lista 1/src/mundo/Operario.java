package mundo;
/*5. Implemente a classe Operario como subclasse da classe Empregado. Um determinado
operário tem como atributos, para além dos atributos da classe Pessoa e da classe
Empregado, o atributo valorProducao (que corresponde ao valor monetário dos artigos
efetivamente produzidos pelo operário) e comissao (que corresponde à porcentagem do
valorProducao que será adicionado ao vencimento base do operário). Note que deverá
redefinir nesta subclasse o método herdado calcularSalario (o salário de um operário é
equivalente ao salário de um empregado usual acrescido da referida comissão). Escreva um
programa de teste adequado para esta classe.*/
public class Operario extends Empregado{
	private double valorProducao;
	private double comissao;
	

    public Operario(String nome, String endereco, int telefone, int codigoSetor, double salarioBase
    		, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
        calcularSalario(); 
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
        calcularSalario(); 
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
        calcularSalario(); 
    }

   // @Override
    public void calcularSalario() {
        double salarioFinal = getSalarioBase() + (valorProducao * comissao) - (getSalarioBase() * getImposto() / 100);
        setSalarioFinal(salarioFinal);
    }

  //  @Override
    public String toString() {
        return "\nOperario" + super.toString() + "\nValor de Produção: " + valorProducao + "\nComissão: " + comissao;
    }

    
}