package drawingTool_00;

public class RandomNumber {
	public static int between(int min, int max) { //static means that the method belongs to the class itself rather than an instance of the class.
		return (int) (Math.random() * ((max - min) + 1) + min);
	}
}

