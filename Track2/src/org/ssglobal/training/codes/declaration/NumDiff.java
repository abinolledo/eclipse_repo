package org.ssglobal.training.codes.declaration;

public class NumDiff { // transactional class

	// no instantiation inside transactional class, only in test class
	
	public int calculateNumdiff(int x) {
		int numdiff = calculateCube(x) - calculateSquare(x);
		return numdiff;
	}

	public int calculateSquare(final int x) {
		int square = x * x;
		return square;
	}
	
	public int calculateCube(final int x) {
		int cube = x * x * x;
		return cube;
	}
}
