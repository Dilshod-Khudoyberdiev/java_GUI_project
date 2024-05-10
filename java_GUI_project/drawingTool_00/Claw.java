package drawingTool_00;

import java.awt.Color;

public class Claw {
	private int width;
	private int height;
	
	public Claw(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void drawAt (int left, int bottom) {
		Drawing.pen().setColor(Color.BLACK);
		Drawing.pen().fillOval(left, bottom, width, height);
		Drawing.pen().fillOval(left, bottom, width, height);
		Drawing.pen().fillOval(left, bottom, width, height);
		Drawing.pen().fillOval(left, bottom, width, height);
		Drawing.pen().fillOval(left, bottom, width, height);
		Drawing.pen().fillOval(left, bottom, width, height);
	}
}
