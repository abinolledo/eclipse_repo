package org.ssglobal.training.codes.declaration;

class MyDataType {

	// global variables
	public static final double PIE = 3.141617; // constants can be class var or global variables; static makes it global variable
	// italize means its a class variable
	public static long versionId = 1L; // versionId are not related but are necessary
	public static String creature = "vertebrate"; // accessible anywhere
	public static int error_level = 0;
	
	public byte counter; // be careful with the datatype; without static modifier, the variable is an instance variable
	public short numProducts;	
	public int numCells = 20000;
	public long numTcells = 20000L;
	
	public float weight = 0.05f;
	public double billGatesMoney = 0.05;
	
	public char letter;
	public String personName = "";
	// public String personName; // if you don't initialize value, value will resort to null
	
	public void createVars() {
		// local variables
		int age = 0; // if you don't initialize local variable value, value will resort to garbage
		float salary;
		final float MY_PIE = 90.6F;
		
		System.out.println(counter);
		System.out.println(age);
		System.out.println(letter);
		System.out.println(personName);
	}

	// parameter passing
	public void manageArguments(final float weight, final byte counter) { // passing literal values to float and byte
		System.out.println(weight);
		
	}
	
	public void createBlockVarsThruIf(int option) {
		
		if (option == 0) {
			int err_val = 10; // block variable : variable declared inside a block code
			option = option + err_val;
			System.out.println(option);
		} else {
			int otherwise_val = - 10; // block var
			option = option + otherwise_val;
			System.out.println(option);
		}
		// System.out.println(err_val); - error because err_val is a block var of if block code
		// block var should be different from local var to avoid collision
	}
	
	public void createBlockVarsThruLoop(int ids[]) {
		
		for (int i = 0; i < ids.length; i++) { // int i = 0 - declaration and assignment
			System.out.println(ids[i]);
		}
		
	}
	
	public void createBlockVarsThruSwitch(int option) {
		
		switch(option) {
		case 1: 
			float amount = 1000.50F;
			System.out.println(1);
			break;
		case 2: 
			System.out.println(2);
			break;
		default: 
			System.out.println(-1);
			break;
		}
		
	}
	
	public void assignLiterals() {
		// integral types
		counter = 127; // within the range -128, 127
		numProducts = 32000;
		numCells = 787878878; // default integral type is int
		numTcells = 7878788789L; // cast - means adding F or L for float and long; caused problem : coercion (bias to int type)
								 // Perl: '2' + 2 == '4'
								 // JavaScript = '2' + 2 = '22'
								 // ===
		// real number types
		billGatesMoney = 99999999999999999.89; // default real type (double), no need to cast
		weight = 89.5f; // coerce to double, needs to cast
		
		// character literal types
		
		// ASCII - have only 127 characters
		letter = 'H';
		System.out.println(letter);
		
		// Numerical value - coercion applies to ASCII only
		letter = 0; // should be \0
		System.out.println(letter);
		letter = 68;
		System.out.println(letter);
		
		// Unicode characters (UTF-8) - hexadecimal form
		letter = '\u00F1'; // ñ
		// letter = 65000; // unicode character, 128 upto 65000 only
		System.out.println(letter);
		// eclipse, utf-8(text file) in resource to be supported by eclipse
		
		// String literals
		personName = "Juan Luna\n"; // String variables are case sensitive
		
		
	}
	
	public void literalConversion() { // method name should be initial lower case and camel case notation  and should be verb
		
		numProducts = 10; // identity conversion
		
		// widening conversion
		int amount = 32000; // implicit casting(casting is not needed) - 
		double salary = 67800.5F;
		
		// narrowing conversion
		byte param = (byte) 128; // wrong, instead of narrowing conversion will resort to -128
		System.out.println(param);
		
		float price = (float) 89.6;
		System.out.println(price);
		
		// return; // valid but not needed since void
	}
}

public class TestMyDataType {
	
	public static void main(String[] args) { // only command line parameter, not able to launch without this

		MyDataType mdt = new MyDataType(); // instantiation
		System.out.println(MyDataType.PIE);
		
		MyDataType.error_level = -1;
		System.out.println(MyDataType.error_level);
		mdt.manageArguments(89.6F, (byte) 0); //parameter passing, coercion problem if do not cast
		mdt.manageArguments(75.6F, (byte) 7); //casting bypass coercion (resorting to int)
		mdt.createBlockVarsThruLoop(new int[] {10, 20, 45, 89});
		System.out.println(mdt.billGatesMoney); // instance variables (dot operators)
		
		mdt.createVars();
		mdt.assignLiterals();
		mdt.literalConversion();
	}

}