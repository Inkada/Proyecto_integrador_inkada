package da_Proyecto_integrador;

import processing.core.PApplet;

public class Main extends PApplet {

	Logica log;

	public static void main(String[] args) {
		PApplet.main("main");

	}

	public void settings() {
		size(600, 700);

	}

	public void setup() {
		log = new Logica(this);

	}

	public void draw() {

	}

}
