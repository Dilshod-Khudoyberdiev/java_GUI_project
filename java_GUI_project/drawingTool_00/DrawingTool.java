package drawingTool_00;

/**
 * Provides a test application window with a panel "DrawingArea".
 * 
 * @author Björn Gottfried
 * @version 1.0
 * @runsWith JAVA 1.8
 * 
 * In this file, you just have to change the title of your window.
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class DrawingTool extends JFrame implements ActionListener {
	private DrawingArea drawing;
	private JPanel drawingPanel;
	private JButton randomColorButton;
	private JButton deleteButton;
	private JButton createButton;
	private JButton orangeButton;
	private JButton redButton;
	private JButton greenButton;

	public DrawingTool(String title) {
		super(title);

		constructDrawingArea();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Dimension screenSize = getToolkit().getScreenSize();
		setBounds(0, 0, screenSize.width, screenSize.height);

		// Create control panel
		drawingPanel = new JPanel();
		drawingPanel.setLayout(new FlowLayout());

		// Create button
		
		orangeButton = new JButton("Make all orange");
		orangeButton.addActionListener(this);
		
		redButton = new JButton("Make all red");
		redButton.addActionListener(this);
		
		greenButton = new JButton("Make all green");
		greenButton.addActionListener(this);
		
		randomColorButton = new JButton("Random color");
		randomColorButton.addActionListener(this);

		deleteButton = new JButton("Delete all");
		deleteButton.addActionListener(this);

		createButton = new JButton("Create");
		createButton.addActionListener(this);

		// Add button to control panel
		drawingPanel.add(orangeButton);
		drawingPanel.add(redButton);
		drawingPanel.add(greenButton);
		drawingPanel.add(randomColorButton);
		drawingPanel.add(deleteButton);
		drawingPanel.add(createButton);

		// Add control panel to the frame
		add(drawingPanel, BorderLayout.NORTH);

		setVisible(true);
	}

	private void constructDrawingArea() {
		drawing = new DrawingArea();
		this.drawing.getScene().removeKoalas();
		setLayout(new BorderLayout());
		add(drawing, BorderLayout.CENTER);
		drawing.revalidate();
		drawing.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == orangeButton) {
			this.drawing.getScene().setOrange();
		} else if (e.getSource() == redButton) {
			this.drawing.getScene().setRed();
		} else if (e.getSource() == greenButton) {
			this.drawing.getScene().setGreen();
		} else if (e.getSource() == randomColorButton) {
			this.drawing.getScene().setRandom();
		} else if (e.getSource() == deleteButton) {
			this.drawing.getScene().setEmpty();
		} else if (e.getSource() == createButton) {
			this.drawing.getScene().setNewKoala();
		}
		// Redraw the scene
		this.drawing.revalidate(); // this tells the layout manager to recalculate the layout (which is necessary when adding components)
		this.drawing.repaint(); // this tells Swing that an area of the window is dirty and must be visually updated
	}

	public static void main(String[] args) {
		new DrawingTool("Drawing a koala");
	}
}
