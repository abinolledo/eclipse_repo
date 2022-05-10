package org.ssglobal.training.codes.answers;

public class TestPassVariables {
	
	public static void main(String[] args) {
	
		PassVariables cv = new PassVariables(); // reference variable is after CompareVariables
		
		// Primitive Var, parameter passing by copy only, literal values are only pass
		int testX = 10;
		System.out.format("This is the original num is %d. \n", testX);
		cv.passPrimitive(testX);
		System.out.format("The new num is %d. \n", testX);
		
		
		// {0000555FFAAB} testSb -> [12345ABCD] ==> 12345ABCD ("Manila")
		// Reference Var
		StringBuilder testSb = new StringBuilder("Manila"); // new creates offspring or object, object is a dot class // [12345ABCD] ("Manila")
		// the " = " means pointed to at
		
		System.out.format("This is the original sb is %s. \n", testSb);
		cv.passRefVar(testSb);
		System.out.format("This is the new sb is %s. \n", testSb);
		
		String testStr = new String("Manila");
		System.out.format("The is the original testStr is %s. \n", testStr);
		cv.passStrVal(testStr); // no passing of address or immutability
		System.out.format("This is the new testStr is %s. \n", testStr);
	}
	

		
	}
	