package drawingTool_00;

import java.awt.Color;
import java.awt.Point;

public class Koala extends Animal implements LocatedRectangle {
	
	private Head head; // composite
	private Body body; // composite
	private int newLeft;
	private int newBottom;	
	
//	public Koala() {
//		this(50, 50); // referring and passing 2 values to that constructor of Koala which has only 2 parameters
//	}
	public Koala (int newLeft, int newBottom, int width, int height){
			super(width, height);
			this.head  = new Head(width * 10, height * 10); // why if I change width and height of head here, 
			this.body = new Body(width * 10, height * 13); // it is affecting width and height of all Head's parts?
			this.newLeft = newLeft;
			this.newBottom = newBottom;
	}
	
//	public void drawAt (int left, int bottom) {
//		head.drawAt(left + 50, bottom + 50);
//		body.drawAt(left + 50, bottom + 147);
//	}
	@Override
	public Point address() {
		Point p = new Point(newLeft, newBottom);
		return p;
	}
	
	@Override
	public void draw() {
		this.head.drawAt(newLeft + 50, newBottom + 50);
		this.body.drawAt(newLeft + 50, newBottom + 147);
	}
	
	@Override
	public int width() {
		return this.head.getHeadWidth() + this.body.getBodyWidth();
	}
	@Override
	public int height() {
		return this.head.getHeadHeight() + this.body.getBodyHeight();
	}
	@Override
	public boolean intersects(LocatedRectangle other) {
		boolean disjoint = other.address().x + other.width() <= this.address().x
				|| other.address().x >= this.address().x + this.width()
				|| other.address().y + other.height() <= this.address().y
				|| other.address().y >= this.address().y + this.height();
		return !disjoint;
	}

	public void newRandomColor() { // changes color to random
		Variation newColor = new Variation();
		this.body.setBodyColor(RandomColor.randDarkColor(newColor.getBodyColor()));
		this.body.getBelly().setBellyColor(RandomColor.randColor(newColor.getBellyColor()));
	}

	public void orangeColor() {
		this.body.setBodyColor(new Color (255, 165, 0));
		this.body.getBelly().setBellyColor(new Color (255, 213, 128));
	}

	public void redColor() {
		this.body.setBodyColor(new Color (255,0,0));
		this.body.getBelly().setBellyColor(new Color (255,114,118));
	}

	public void greenColor() {
		this.body.setBodyColor(new Color (0, 128, 0));
		this.body.getBelly().setBellyColor(new Color (144, 238, 144));
		
	}
}


	
