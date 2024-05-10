package drawingTool_00;

public class Belly extends Variation {
	private int height;
	private int width;
	
	public Belly (int width, int height) {
		this.height = height;
		this.width = width;
	}
	public void drawAt (int left, int bottom) {
		Drawing.pen().setColor(super.getBellyColor());
		Drawing.pen().fillOval(left, bottom, width, height);
	}
}
