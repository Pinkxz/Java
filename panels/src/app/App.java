package app;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import model.*;
import view.*;
import controller.*;

public class App {

public static void main(String[] args) {
		Jogador model = new Jogador();
		JogaView  view = new JogaView();
		@SuppressWarnings("unused")
		JogaControl controller = new JogaControl(model, view);

	}

}

