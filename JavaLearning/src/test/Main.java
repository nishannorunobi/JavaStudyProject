package test;

import java.io.IOException;

import javax.xml.soap.SOAPException;

public class Main {
	static String str = "abc";
	static StringBuilder sb = new StringBuilder("xyz");
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException, Exception, SOAPException {
		Integer i = new Integer(5);
		Integer i2= new Integer(5);
		int x = 5;
		int x2= 5;
		if(i == x)
			System.out.println("reference compared");
		else
			System.out.println("hashcode compared");
		
	}

	private static void print(final StringBuilder sb2) {
		if(sb == sb2)
			System.out.println(sb2);
	}

	private static void print(String str2) {
		String str3 = "abc";
		if(str == str2)
			System.out.println(str);
		if(str == str3)
			System.out.println(str);
		String str4 = "".concat("abc");
		if(str3 == str4)
			System.out.println(str4);
		String str5 = new String("abc");
		if(str5 == str3)
			System.out.println(str5);
	}

}
