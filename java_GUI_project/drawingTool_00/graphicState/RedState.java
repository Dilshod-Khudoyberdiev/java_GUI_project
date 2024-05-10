package drawingTool_00.graphicState;

import drawingTool_00.*;

public class RedState extends State {
	
	private static RedState instance;

	private RedState(Scene context) {
		 this.context = context;
		 redKoalas = this;
	}

	public static State getInstance(Scene context) {
		if (instance == null) {
			instance = new RedState(context);
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
		return this;
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
