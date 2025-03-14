package drh;

public class Reitor extends EmpregadoDaFaculdade {
	  // informações extras
    public String getInfo() {
        return super.toString() + " e ele é um reitor";
    }
     // não sobrescrevemos o getGastos!!!

}
