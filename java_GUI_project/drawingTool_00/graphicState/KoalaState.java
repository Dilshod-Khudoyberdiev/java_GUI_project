package drawingTool_00.graphicState;

import drawingTool_00.*;

public class KoalaState extends State {

	private static KoalaState instance;

	private KoalaState(Scene context) {
		 this.context = context;
		 koalas = this;
	}

	public static State getInstance(Scene context) {
		if (instance == null) {
			instance = new KoalaState(context);
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
		return this;
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
