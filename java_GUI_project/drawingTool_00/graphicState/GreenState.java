package drawingTool_00.graphicState;

import drawingTool_00.*;

public class GreenState extends State {
	
	private static GreenState instance;

	private GreenState(Scene context) {
		 this.context = context;
		 greenKoalas = this;
	}

	public static State getInstance(Scene context) {
		if (instance == null) {
			instance = new GreenState (context);
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
		return this;
	}

	@Override
	public State changeToRandom() {
		context.makeRandomColor();
		return RandomState.getInstance(context);
	}
}
