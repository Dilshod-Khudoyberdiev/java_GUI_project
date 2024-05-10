package drawingTool_00;

public class Body extends Variation {
	private Belly belly; // composite
	private Leg leg1; // composite
	private Leg leg2; // composite
	private Paw paw1; // composite
	private Paw paw2; // composite
	private Claw claw1; // composite
	private Claw claw2; // composite
	private Claw claw3; // composite
	private Claw claw4; // composite
	private Claw claw5; // composite
	private Claw claw6; // composite
	private int height;
	private int width;
	
	public Body (int width, int height) {
		belly = new Belly(width / 5 * 4, height / 13 * 8);
		leg1 = new Leg(width / 25 * 6, height / 10 * 3);
		leg2 = new Leg(width / 25 * 6, height / 10 * 3);
		paw1 = new Paw(width / 5 * 2, height / 26 * 7);	
		paw2 = new Paw(width / 5 * 2, height / 26 * 7);
		claw1 = new Claw (width / 10, height / 26);
		claw2 = new Claw (width / 10, height / 26);
		claw3 = new Claw (width / 10, height / 26);
		claw4 = new Claw (width / 10, height / 26);
		claw5 = new Claw (width / 10, height / 26);
		claw6 = new Claw (width / 10, height / 26);
		this.height = height;
		this.width = width;
	}
	public void drawAt(int left, int bottom) {
		Drawing.pen().setColor(super.getBodyColor());
		Drawing.pen().fillOval(left, bottom, width, height);
		belly.drawAt(left + 10, bottom + 23);
		leg1.drawAt (left + 22, bottom + 120);
		leg2.drawAt (left + 54, bottom + 120);
		paw1.drawAt (left - 35, bottom + 40);
		paw2.drawAt (left + 95, bottom + 40);
		claw1.drawAt(left - 24, bottom + 45);
		claw2.drawAt(left - 26, bottom + 53);
		claw3.drawAt(left - 28, bottom + 61);
		claw4.drawAt(left + 114, bottom + 45);
		claw5.drawAt(left + 116, bottom + 53);
		claw6.drawAt(left + 118, bottom + 61);
	}
	public int getBodyWidth() {
		return width + leg1.getLegWidth();
	}

	public int getBodyHeight() {
		return height + leg1.getLegHeight();
	}

	public Belly getBelly() {
		return belly;
	}
}
