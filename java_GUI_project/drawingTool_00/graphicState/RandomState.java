package drawingTool_00.graphicState;

import drawingTool_00.*;

public class RandomState extends State {
	
	private static RandomState instance;

	private RandomState(Scene context) {
		 this.context = context;
		 randomKoalas = this;
	}

	public static State getInstance(Scene context) {
		if (instance == null) {
			instance = new RandomState(context);
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
		return this;
	}
}
