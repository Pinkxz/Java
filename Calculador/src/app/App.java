package app;
import model.*;
import view.*;
import controller.*;

public class App {

	public static void main(String[] args) {
		CalculadoraModel model = new CalculadoraModel();
		CalculadoraView view = new CalculadoraView();
		
		CalculadoraController controller = new CalculadoraController(model, view);
	}
}
