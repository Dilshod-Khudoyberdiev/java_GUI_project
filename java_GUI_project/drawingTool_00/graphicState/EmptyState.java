package drawingTool_00.graphicState;

import drawingTool_00.*;

public class EmptyState extends State {

	private static EmptyState instance;

	private EmptyState(Scene context) {
		 this.context = context;
		 noKoalas = this;
	}

	public static State getInstance(Scene context) {
		if (instance == null) {
			instance = new EmptyState(context);
		}
		return instance;
	}

	@Override
	public State clearKoalas() {
		context.removeKoalas();
		return this;
	}

	@Override
	public State addNewKoala() {
		context.generateKoalas();
		return KoalaState.getInstance(context);
	}

	@Override
	public State changeToOrange() {
		context.makeOrange();
		return OrangeState.getInstance(context);
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
