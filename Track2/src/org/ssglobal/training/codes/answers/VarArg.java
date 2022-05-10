package org.ssglobal.training.codes.answers;

public class VarArg {

	public void printNums(int...nums) {
		if (nums.length == 0) {
			System.out.println("Empty list");
		} else {
			// do transactions
		}
		
//		for(int lookup: nums) {
//			System.out.println(lookup);
//		}
	}
	
	public void acceptComplexData(int x, int...y) {}
}


