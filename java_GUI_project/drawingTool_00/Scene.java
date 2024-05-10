package drawingTool_00;

import java.util.ArrayList;
import java.awt.Point;

import drawingTool_00.graphicState.*; // importing all classes in graphicState package

public class Scene {
	private static State graphicState; // it's going to tell you in which state you are
	private ArrayList<Koala> koalas;

	public Scene(DrawingArea drawingArea) { // for passing drawingArea to the constructor of one of the states
		this.koalas = new ArrayList <Koala>();
		graphicState = KoalaState.getInstance(this);// that instance method which provides me the only instance of one													// of the states, this shows starter point
	}
	
//	public Scene() {
//		koalas = new ArrayList<Koala>();
//	}

	public void setEmpty() {
		graphicState = graphicState.clearKoalas();
	}

	public void setNewKoala() {
		graphicState = graphicState.addNewKoala();
	}

	public void setOrange() {
		graphicState = graphicState.changeToOrange();
	}

	public void setRed() {
		graphicState = graphicState.changeToRed();
	}

	public void setGreen() {
		graphicState = graphicState.changeToGreen();
	}

	public void setRandom() {
		graphicState = graphicState.changeToRandom();
	}

	public void generateKoalas() {
		int width = 10; // defining width
		int height = 10; // defining height
		for (int numberOfKoalas = 0; numberOfKoalas < 1; numberOfKoalas++) {
			int x = RandomNumber.between(0, 1330); // defining xLocation 0, 1330
			int y = RandomNumber.between(-50, 450); // defining yLocation -50, 450
			new Point(x, y);
			Koala koala = new Koala(x, y, width, height); // passing values to the constructor of Koala class
			addAnotherKoala(koala);
//			koala.speak(); // just to demonstrate inheritance relationship
		}
	}

	public void draw() { // for each koala in the "koalas" ArrayList perform {koala.draw action}
		for (Koala koala : koalas) {
			koala.draw();
		}
	}

	private void addAnotherKoala(Koala newKoala) {
		boolean intersection = false;
		for (Koala koala : koalas) {
			intersection = intersection || koala.intersects(newKoala);
		}
		if (!intersection) {
			koalas.add(newKoala);
			/*
			 * it checks if intersection is false (meaning there was no intersection with
			 * any existing Koala object). If that's the case, it adds the newKoala object
			 * to the koalas ArrayList using the add() method.
			 */
		}
	}

	public void makeRandomColor() { // changes to random color
		for (Koala koala : koalas)
			koala.newRandomColor();
	}

	public void removeKoalas() { // delete all koalas
		this.koalas.clear();
	}

	public void makeOrange() { // changes to orange color
		for (Koala koala : koalas)
			koala.orangeColor();
	}

	public void makeRed() { // changes to red color
		for (Koala koala : koalas)
			koala.redColor();
	}

	public void makeGreen() { // changes to green color
		for (Koala koala : koalas)
			koala.greenColor();
	}
}
