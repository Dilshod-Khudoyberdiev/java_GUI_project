package drawingTool_00;

import java.awt.Color;

public class Mouth {
	private int height;
	private int width;

	public Mouth(int width, int height) {
		this.height = height;
		this.width = width;
	}

	public void drawAt(int left, int bottom) {
		Drawing.pen().setColor(new Color(0xff647f));
		Drawing.pen().fillOval(left, bottom, width, height);
	}
}
