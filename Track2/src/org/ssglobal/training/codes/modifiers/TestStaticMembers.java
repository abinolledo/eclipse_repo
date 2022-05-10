package org.ssglobal.training.codes.modifiers;

public class TestStaticMembers {

	public static void main(String[] args) {
		StaticMembers sm1 = new StaticMembers();
		StaticMembers sm2 = new StaticMembers();
		StaticMembers sm3 = new StaticMembers();
		
		// instance variables
		sm1.e = 3.17;
		System.out.println(sm1.e);
//		sm2.e = 4.17;
		System.out.println(sm2.e);
//		sm3.e = 5.17;
		System.out.println(sm3.e);
		
		StaticMembers.pie = 4.141717;
		System.out.println(StaticMembers.pie);
//		sm2.pie = 3.15;
		System.out.println(sm2.pie);
//		sm3.pie = 3.17;
		System.out.println(sm3.pie);
		
		//instance Methods
		sm1.isZero(0);
		sm2.isZero(100);
		sm2.isZero(-1);
		
		StaticMembers.even(-10);
		StaticMembers.even(100);
		StaticMembers.even(5);
	}

}
