package app;
import controller.LoginController;
import model.*;
import view.*;

public class App {

	public static void main(String[] args) {
		LoginModel model = new LoginModel();
		LoginView view = new LoginView();

		LoginController controller = new LoginController(model, view);
	}

}
