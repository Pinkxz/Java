package aplicativo;

import drh.EmpregadoDaFaculdade;
import drh.ProfessorDaFaculdade;
import drh.Reitor;
import relatorio.GeradorDeRelatorio;

public class ProgramaFaculdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade("Ze", 998.0);
		//EmpregadoDaFaculdade empregado1 = new EmpregadoDaFaculdade();
		try {
			empregado.setNome("");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		//System.out.println(empregado);
		//empregado.setNome("Z�");
		//empregado.setSalario(998.10);
		
		
		ProfessorDaFaculdade professor = new ProfessorDaFaculdade(5,"Alexandre", 1000.0);
		//professor.setNome("Alexandre");
		//professor.setSalario(1000.0);
		//professor.setHorasDeAula(5);
		//System.out.println(professor);
		
		Reitor reitor = new Reitor();
		try {
			reitor.setNome("Manoel");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		reitor.setSalario(10000.0);
		
		GeradorDeRelatorio relatoriosDeEmpregados = new GeradorDeRelatorio();
		relatoriosDeEmpregados.listar(empregado);
		relatoriosDeEmpregados.listar(professor);
		relatoriosDeEmpregados.listar(reitor);
	}

}
