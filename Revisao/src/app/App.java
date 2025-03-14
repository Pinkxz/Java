package app;
import model.*;
import view.*;
import controller.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginModel model = new LoginModel();
		LoginView view = new LoginView();
		
		LoginController controller = new LoginController(model, view);
	}

}
