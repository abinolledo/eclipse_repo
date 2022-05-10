package org.ssglobal.training.codes.answers;

import org.ssglobal.training.codes.arrays.SampleArrays;
import org.ssglobal.training.codes.operators.McDonaldFood;

class Fraction { // one file, one public class
	
	public SampleArrays sample; // from another package, import is needed
	public McDonaldFood mcdo = new McDonaldFood();
	
	public static long id = 90L;
	
	public int numerator; // does not need to assign value because of default values
	public int denominator;
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void toFractionString() {
		Overflow over = new Overflow();
		System.out.println(numerator + "/" + denominator);
	}

	public Fraction add(Fraction summand) {
		numerator = numerator * summand.denominator + summand.numerator * denominator;
		denominator = denominator * summand.denominator;
		
		Fraction f = new Fraction();
		f.numerator = numerator;
		f.denominator = denominator;
		return f;
	}
	
	public Fraction multiply(Fraction factor) {
		numerator = numerator * factor.numerator;
		denominator = denominator * factor.denominator;
		
		Fraction f = new Fraction();
		f.numerator = numerator;
		f.denominator = denominator;
		return f; // return null for object

	}
	
	public boolean greaterEqual(Fraction fraction) {
		
		int numer1 = numerator * fraction.denominator;
		int numer2 = fraction.numerator * denominator;
		
		if (numer1 <= numer2) {
			return true;
		} else {
			return false;
		}	
//		return false; - unreachable code, cannot interpret 
	}
	
}

