package org.ssglobal.training.codes.modifiers;

public class ClassMembers {

	// static variables
	public static long id = 1;
	double salary = 100.5;
	protected int key = 68638453;
	private char letter = 'v';
	
	// instance variables
	public int age = 10;
	
	// methods
	
	public void showData() {
		id = 2L;
		salary = 5000.5;
		key = 855885;
		letter = 'h';
	}
	
	void printData() {
			
	}
	
	
	protected void authenticate() { //accessible
		
		
	}
	
	private void encryptData() { // can be access inside class
	
	}
	
	public void reference() {
		showData();
		printData(); // triangle means there is a design pattern
		authenticate();
		encryptData();
		
	}
	
	
}
