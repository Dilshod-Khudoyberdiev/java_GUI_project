package drawingTool_00;

import java.awt.Color;

public class Head {
	private Mouth mouth; // composite
	private Nose nose; // composite
	private Ear ear1; // composite
	private Ear ear2; // composite
	private Eye eye1; // composite
	private Eye eye2; // composite
	private Spot spot1; // composite
	private Spot spot2; // composite
	private Iris iris1; // composite
	private Iris iris2; // composite
	private Pupil pupil1; // composite
	private Pupil pupil2; // composite
	private int height;
	private int width;

	public Head(int width, int height) {
		mouth = new Mouth(width / 4, height / 25 * 2);
		nose = new Nose(width / 5, height / 10 * 3);
		ear1 = new Ear(width / 20 * 11, height / 25 * 16);
		ear2 = new Ear(width / 20 * 11, height / 25 * 16);
		eye1 = new Eye(width / 4, height / 4);
		eye2 = new Eye(width / 4, height / 4);
		spot1 = new Spot(width / 50 * 11, height / 50 * 19);
		spot2 = new Spot(width / 25 * 6, height / 50 * 19);
		iris1 = new Iris(width / 5, height / 5);
		iris2 = new Iris(width / 5, height / 5);
		pupil1 = new Pupil(width / 25 * 2, height / 25 * 2);
		pupil2 = new Pupil(width / 25 * 2, height / 25 * 2);
		this.height = height;
		this.width = width;
	}

	public void drawAt(int left, int bottom) {
		Drawing.pen().setColor(Color.GRAY);
		Drawing.pen().fillOval(left, bottom, width, height);
		mouth.drawAt(left + 37, bottom + 81);
		nose.drawAt(left + 40, bottom + 50);
		ear1.drawAt(left - 25, bottom);
		ear2.drawAt(left + 75, bottom);
		eye1.drawAt(left + 20, bottom + 25);
		eye2.drawAt(left + 55, bottom + 25);
		spot1.drawAt(left - 15, bottom + 14);
		spot2.drawAt(left + 96, bottom + 14);
		iris1.drawAt(left + 22, bottom + 27);
		iris2.drawAt(left + 57, bottom + 27);
		pupil1.drawAt(left + 22, bottom + 27);
		pupil2.drawAt(left + 57, bottom + 27);
	}
	public int getHeadWidth() {
		return width;
	}

	public int getHeadHeight() {
		return height;
	}
}
