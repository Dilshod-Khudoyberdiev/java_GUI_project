package drawingTool_00.graphicState;

import drawingTool_00.*;

public class OrangeState extends State {
	
	private static OrangeState instance;

	private OrangeState(Scene context) {
		 this.context = context;
		 orangeKoalas = this;
	}

	public static State getInstance(Scene context) {
		if (instance == null) {
			instance = new OrangeState(context);
		}
		return instance;
	}

	@Override
	public State clearKoalas() {
		context.removeKoalas();
		return EmptyState.getInstance(context);
	}

	@Override
	public State addNewKoala() {
		context.generateKoalas();
		return KoalaState.getInstance(context);
	}

	@Override
	public State changeToOrange() {
		context.makeOrange();
		return this;
	}

	@Override
	public State changeToRed() {
		context.makeRed();
		return RedState.getInstance(context);
	}

	@Override
	public State changeToGreen() {
		context.makeGreen();
		return GreenState.getInstance(context);
	}

	@Override
	public State changeToRandom() {
		context.makeRandomColor();
		return RandomState.getInstance(context);
	}
}
