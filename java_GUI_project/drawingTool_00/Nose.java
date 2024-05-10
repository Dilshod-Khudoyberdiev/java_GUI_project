package drawingTool_00;

import java.awt.Color;

public class Nose {
	private int height;
	private int width;

	public Nose (int width, int height) {
		this.height = height;
		this.width = width;
	}
	public void drawAt (int left, int bottom) {
		Drawing.pen().setColor(Color.BLACK);
		Drawing.pen().fillOval(left, bottom, width, height);
	}
}