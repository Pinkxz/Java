package drh;
import drh.EmpregadoDaFaculdade;
public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
	
	public ProfessorDaFaculdade() {
		super();
	}
	public ProfessorDaFaculdade(int horasDeAula, String nome, double salario) {
		super(nome,salario);	
		this.horasDeAula = horasDeAula;
	}

	private int horasDeAula;
   

	
	public double getSalario() {
        return super.getSalario() + this.horasDeAula * 10;
    }
    
	public String toString() {
        String informacaoBasica = super.toString();
        String informacao = informacaoBasica + " horas de aula: " 
                                                + this.horasDeAula;
        return informacao;
    }
    // métodos de get, set e outros que forem necessários
	/**
	 * @return the horasDeAula
	 */
	public int getHorasDeAula() {
		return horasDeAula;
	}

	/**
	 * @param horasDeAula the horasDeAula to set
	 */
	public void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}

}
