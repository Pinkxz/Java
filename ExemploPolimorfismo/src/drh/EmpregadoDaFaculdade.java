package drh;

public class EmpregadoDaFaculdade {
	private String nome;
    private double salario;
    
	public EmpregadoDaFaculdade() {
		
	}
	public EmpregadoDaFaculdade(String nome, double salario) {
		super();//Vai para o super classe do java que Object
		try {
			this.setNome(nome);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getStackTrace();
		}
		this.salario = salario;
	}

    
    public double getSalario() {
        return this.salario;
    }
    
    public String toString() {
        String retorno = null;
    	try{
        	retorno = "nome: " +this.getNome()+ " com salário " + this.getSalario();
        }
        catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
		}
    	return retorno;
   }
   					
     // métodos de get, set e outros

	/**
	 * @return the nome
	 */
	public String getNome() throws Exception{
		if(this.nome.isEmpty())
			throw new Exception("Nome vazio abortando método");
		else
			return nome.toUpperCase();
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) throws Exception {
		if(nome.isEmpty()) {
			throw new Exception("Nome nao pode ser vazio!!");
		}
		else {
			this.nome = nome;
			System.out.println("nome no setNome:" + nome);
		}
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		if(salario > 0)
			this.salario = salario;
	}

}
