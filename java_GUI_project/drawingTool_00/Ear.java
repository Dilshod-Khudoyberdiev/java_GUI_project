package drawingTool_00;

import java.awt.Color;

public class Ear {
	private int height;
	private int width;
	
	public Ear(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	public void drawAt (int left, int bottom) {
		Drawing.pen().setColor(Color.GRAY);
		Drawing.pen().fillOval(left, bottom, width, height);
		Drawing.pen().fillOval(left, bottom, width, height);
}
	}
