package org.ssglobal.training.codes.modifiers;

public class GraphSearch extends MyLog { // inheritance

	
	public void plot() {
		GraphMe gm = new GraphMe();
		gm.scatter(); // sharing or reusing method
		computeLogBase10();
		
	}
}
