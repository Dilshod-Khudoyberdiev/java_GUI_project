package drawingTool_00.graphicState;

import drawingTool_00.*;

public abstract class State {

	protected Scene context;

	protected static EmptyState noKoalas; // we do not need this properties because we have getter for single instance of all states
	protected static KoalaState koalas; // these are redundant
	protected static OrangeState orangeKoalas;
	protected static RedState redKoalas;
	protected static GreenState greenKoalas;
	protected static RandomState randomKoalas;

	public abstract State clearKoalas();

	public abstract State addNewKoala();

	public abstract State changeToOrange();

	public abstract State changeToRed();

	public abstract State changeToGreen();

	public abstract State changeToRandom();

}
