package org.ssglobal.training.codes.modifiers;

public class StaticMembers {

	public static double pie = 3.14;
	public double e = 2.17;
	
	
	
	public static boolean even(int value) {
		isZero(10);
		int x = 0;
		
		if(true) {
				int y = 5;// static one copy only
		}
		return value % 2 == 0;
	}
	public static boolean isZero(int value) {
		return value == 0;
	}
	
}
