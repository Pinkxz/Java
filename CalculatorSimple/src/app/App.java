package app;
import controller.CalcController;
import model.*;
import view.*;

public class App {

	public static void main(String[] args) {
		CalcModel model = new CalcModel();
		CalcView view = new CalcView();
		
		CalcController controller = new CalcController(model, view);
		
	}

}
