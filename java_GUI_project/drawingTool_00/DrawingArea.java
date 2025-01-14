package drawingTool_00;

/**
 * Provides a panel on which an object of class "Graphics" can draw.
 * 
 * @author Björn Gottfried
 * @version 1.0
 * @runsWith JAVA 1.8
 * 
 * In this file, you have to add two lines of code:
 * 		+ instantiate one object of your domain class
 * 		+ call its drawAt-method
 */
import javax.swing.JPanel;
import java.awt.*;

@SuppressWarnings("serial")
public class DrawingArea extends JPanel {
	private Scene scene;

	public DrawingArea() {
		scene = new Scene(this); // important
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Drawing.set(g);
		setBackground(new Color(173, 216, 230));// set background color to light blue

		scene.draw();
		// here comes your code...
		// please, don't use the following commands in this file
		// use them ONLY in your "drawAt"-methods of YOUR domain classes!!!

//		Drawing.pen().drawLine(10, 400, 400, 400);
//		Drawing.pen().drawRect(300, 300, 50, 50);
//		Drawing.pen().setColor(Color.BLUE);
//		Drawing.pen().fillRect(400, 500, 80, 30);
//		Drawing.pen().drawOval(200, 500, 50, 50);
		// you find further commands at oracle docs for Java 1.8:
		// https://docs.oracle.com/javase/8/docs/api/java/awt/Graphics.html
	}

	public Scene getScene() {
		return this.scene;
	}
}