package drawingTool_00;

import java.awt.Color;

public class Leg extends Variation{
	private int height;
	private int width;

	public Leg (int width, int height) {
		this.height = height;
		this.width = width;
	}
	public void drawAt (int left, int bottom) {
		Drawing.pen().setColor(new Color (0x808080));
		Drawing.pen().fillOval(left, bottom, width, height);
		Drawing.pen().fillOval(left, bottom, width, height);
	}
	public int getLegHeight() {
		return height;
	}
	public int getLegWidth() {
		return this.width;
	}
}
