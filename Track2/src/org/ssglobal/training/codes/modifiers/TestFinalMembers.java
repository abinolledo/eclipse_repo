package org.ssglobal.training.codes.modifiers;

public class TestFinalMembers extends FinalMembers{
	
	public static num = 0;
	
	public static void main(String[] args) {
		FinalMembers fm = new FinalMembers();
		System.out.println(fm.PIE);
		
		fm.accessWithoutOverride(); // dot operator manghihiram
		fm.accessPoint();
		
		System.out.println(num);
	}

	
	public void accessPoint() {
		accessWithoutOverride();
	}
}
