package org.ssglobal.training.codes.operators;

public class Unary {
	
	public void loopWithCounterVarPost () { // counter var - temp variables , will print initial value
		
		int counter = 0;
		int counterVar = 0;
		while (counterVar < 10) {
			System.out.format("%d %d\n", counterVar, counter);
			//System.out.println(counterVar);
			counterVar = counter++;
		}
		
	}

	public void loopWithoutCounterVarPost () {
		
		int counter = 0;
		while(counter < 10) {
			System.out.println(counter);
			counter++; // var++ increment by 1, part of conditional expression, temp variable
		}
	}

	public void loopWithoutCounterVarPre () {
		
		int counter = 0;
		while(counter < 10) {
			System.out.println(counter);
			++counter; // var++ increment by 1, part of conditional expression, temp variable
		}
	}

	
	
	public void loopWithCounterVarPre () {
		
		int counter = 0;
		int counterVar = 0;
		while(counterVar < 10) {
			System.out.format("%d %d\n", counterVar, counter);
			counterVar = ++counter; // var++ increment by 1, part of conditional expression, temp variable
		}
	}

}
