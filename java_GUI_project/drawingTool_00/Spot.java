package drawingTool_00;

import java.awt.Color;

public class Spot {
	private int width;
	private int height;

	public Spot(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public void drawAt (int left, int bottom) {
		Drawing.pen().setColor(Color.PINK);
		Drawing.pen().fillOval(left, bottom, width, height);
		Drawing.pen().fillOval(left, bottom, width, height);
	}
}
