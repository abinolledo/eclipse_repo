package org.ssglobal.training.codes.modifiers;

public class FinalMembers  {

	public final double PIE = 3.141617; // final means constant
	public final StringBuilder FLOWER = new StringBuilder ("Santan"); 
	
	
	public final void accessWithoutOverride() {
		
	}
	
	public void accessPoint() {
		FLOWER.append(" in Baguio");
		System.out.println(FLOWER);
//		FLOWER = new StringBuilder ("Gumamela"); // pointer to its objects memory address
	}
	
}
