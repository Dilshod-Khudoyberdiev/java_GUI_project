package drawingTool_00;

import java.awt.Color;

public class Paw {
	private int height;
	private int width;

	public Paw (int width, int height) {
		this.height = height;
		this.width = width;
	}
	public void drawAt (int left, int bottom) {
		Drawing.pen().setColor(Color.LIGHT_GRAY);
		Drawing.pen().fillOval(left, bottom, width, height);
		Drawing.pen().fillOval(left, bottom, width, height);
	}
}
