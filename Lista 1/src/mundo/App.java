package mundo;
//import javax.swing.*;


public class App {
	public static void main(String[] args) {
//Modelo: 								   (nome,      rua, numeroDeTel, credito, divida)		
		Fornecedor Forn = new Fornecedor("zap zap", "rua do esseccs", 626, 5.0, 2.5);
		System.out.println(Forn);
		
//Modelo:                             (nome			rua,       nmrTel, setor, salario, %de imposto)
		Empregado Emp = new Empregado("fi fu fiu", "rua teste", 762, 2, 3440, 30);
		System.out.println(Emp);
		
//Modelo:                                      (nome			rua,       nmrTel, setor, salario, %de imposto, ajd.Custos)		
		Administrador Admin = new Administrador("adminteste", "ruadois", 6969, 3, 2440, 25, 1000);
		System.out.println(Admin);
		
//Modelo:                           (nome	   rua,    nmrTel, setor, salario, %de imposto, valorProducao, comissao)		
		Operario Ope = new Operario("opteste", "rua10", 62435, 5, 1440, 25, 50, 30);
		System.out.println(Ope);
		
//Modelo:                           (nome	   rua,    nmrTel, setor, salario, %de imposto, valorVendas, comissao)		
		Vendedor Vend = new Vendedor("venteste", "rua5", 125, 6, 440, 25, 25, 10);
		System.out.println(Vend);
	}
}