package drawingTool_00;

public abstract class Animal {
	private int width;
	private int height;

//	public Animal() { // default constructed which passes 0 and 0 to specific constructor
//		this (0,0);	// the purpose is that some animal class objects will have default sizes
//	}

	public Animal(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public abstract void draw();
}
