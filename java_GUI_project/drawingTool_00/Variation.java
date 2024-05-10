package drawingTool_00;

import java.awt.Color;

public class Variation {
	private Color bodyColor;
	private Color bellyColor;

	public Variation() {
		this.bodyColor = new Color(0x808080);
		this.bellyColor = new Color(0xD3D3D3);
	}

	public void setBodyColor(Color bodyColor) {
		this.bodyColor = bodyColor;
	}

	public void setBellyColor(Color bellyColor) {
		this.bellyColor = bellyColor;
	}

	public Color getBodyColor() {
		return this.bodyColor;
	}

	public Color getBellyColor() {
		return this.bellyColor;
	}
}
