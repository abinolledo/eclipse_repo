package org.ssglobal.training.codes.declaration;

public class TestNumDiff { // NumDiff test class

	public static void main(String[] args) { // command line parameter	
		String num = args[0];
		int numVal = Integer.parseInt(num); // conversion needed because of command line parameter
			// ref var = new class constructor
		NumDiff diff = new NumDiff(); // instantiation declaration = new class constructor, needed 
		int result = diff.calculateNumdiff(numVal); // local variable 
		System.out.println(result);

	}

}


// to test class
// instantiate
// need to submit one test class and transactional class