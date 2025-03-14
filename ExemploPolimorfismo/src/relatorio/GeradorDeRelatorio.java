package relatorio;

import java.nio.file.ProviderNotFoundException;

import drh.EmpregadoDaFaculdade;
import drh.ProfessorDaFaculdade;
import drh.Reitor;

public class GeradorDeRelatorio {
	
	public void listar(EmpregadoDaFaculdade f) {
        System.out.println(f);
        System.out.println(f.getSalario());
        if (f instanceof Reitor)
        	System.out.println("Reitor");
        else
        	if(f instanceof ProfessorDaFaculdade) {
        		System.out.println("Professor da Faculdade");
        		ProfessorDaFaculdade fNovo = (ProfessorDaFaculdade)f;
        		System.out.println("Horas aulas: " + fNovo.getHorasDeAula());
        	}
        	else
        		if(f instanceof EmpregadoDaFaculdade)
        			System.out.println("Empregado da Faculdade");        
    }

}
