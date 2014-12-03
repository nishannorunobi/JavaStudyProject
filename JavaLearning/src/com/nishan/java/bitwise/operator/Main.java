package com.nishan.java.bitwise.operator;

public class Main {
	private static int paddingLength;
	static int a = 67;
	static int b = 15;
	static int c;
	static StringBuilder valueA = new StringBuilder(Integer.toBinaryString(a));
	static StringBuilder valueB = new StringBuilder(Integer.toBinaryString(b));
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		c = a&b;
		String binaryC = getPadding(new StringBuilder(Integer.toBinaryString(c)));
		System.out.println("a&b = "+c+" = "+binaryC);
		//////////
		c = a|b;
		binaryC = getPadding(new StringBuilder(Integer.toBinaryString(c)));
		System.out.println("a|b ="+c+" = "+binaryC);
		//////////
		c = a^b;
		binaryC = getPadding(new StringBuilder(Integer.toBinaryString(c)));
		System.out.println("a^b ="+c+" = "+binaryC);
		//////////
		c = ~b;
		binaryC = getPadding(new StringBuilder(Integer.toBinaryString(c)));
		System.out.println("~b ="+c+" = "+binaryC);
		//////////
		c = b>>1;
		binaryC = getPadding(new StringBuilder(Integer.toBinaryString(c)));
		System.out.println("b>>1 ="+c+" = "+binaryC);
		//////////
		c = b>>2;
		binaryC = getPadding(new StringBuilder(Integer.toBinaryString(c)));
		System.out.println("b>>2 ="+c+" = "+binaryC);
		//////////
		c = b>>>2;
		binaryC = getPadding(new StringBuilder(Integer.toBinaryString(c)));
		System.out.println("b>>>2 ="+c+" = "+binaryC);
		//////////
		c = b>>>3;
		binaryC = getPadding(new StringBuilder(Integer.toBinaryString(c)));
		System.out.println("b>>>3 ="+c+" = "+binaryC);
		//////////
		c = b<<1;
		binaryC = getPadding(new StringBuilder(Integer.toBinaryString(c)));
		System.out.println("b<<1 ="+c+" = "+binaryC);
		//////////
		c = b<<2;
		binaryC = getPadding(new StringBuilder(Integer.toBinaryString(c)));
		System.out.println("b<<2 ="+c+" = "+binaryC);
		//c = b<<<2; comile error
	}


	private static void printAB() {
		setPadding(valueA, valueB);
		System.out.println();
		System.out.println("######################");
		System.out.println("a =  "+a+" = "+valueA);
		System.out.println("b =  "+b+" = "+valueB);
		System.out.println("---------------------");
	}

	private static void setPadding(StringBuilder valueA, StringBuilder valueB) {
		StringBuilder value = null;
		if(valueA.length() > valueB.length()){
			value = valueB;
			paddingLength = valueA.length();
		}else{
			value = valueA;
			paddingLength = valueB.length();
		}
		int len = paddingLength - value.length();
		for (int i = 0; i < len; i++) {
			value.insert(0, "0");
		}
	}
	private static String getPadding(StringBuilder value) {
		if(value.length() > paddingLength)
			paddingLength = value.length();
		printAB();
		int len = paddingLength - value.length();
		for (int i = 0; i < len; i++) {
			value.insert(0, "0");
		}
		return value.toString();
	}
}
