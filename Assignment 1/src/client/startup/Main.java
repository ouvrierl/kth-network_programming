package client.startup;

import java.io.IOException;

import client.view.Screen;

public class Main {

	public static void main(String[] args) throws IOException {
		Screen screen = new Screen();
		screen.startController();
		screen.startView();
	}

}
