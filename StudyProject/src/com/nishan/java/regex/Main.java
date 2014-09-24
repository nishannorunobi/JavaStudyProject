package com.nishan.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public final static String alphNum = "^[0-9a-zA-Z][0-9a-zA-Z]*";
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*System.out.println(check("1234",alphNum));
		System.out.println(check("sdf",alphNum));
		System.out.println(check("AGAS",alphNum));
		System.out.println(check("dgs124",alphNum));
		System.out.println(check("2222rhe",alphNum));
		System.out.println(check("234DFF",alphNum));
		System.out.println(check("FGR133",alphNum));
		System.out.println(check("!%_&(*^*(",alphNum));
		System.out.println(check("!%KJHGH",alphNum));
		System.out.println(check("!%KJHGH",alphNum));
		System.out.println(check("",alphNum));
		System.out.println(check(" ",alphNum));*/
		System.out.println(getTokenFromSms("Your token for mobile number verification is 154563. Please enter the token to complete the registration"));
		//System.out.println(getTokenFromSms("رمز المصادقة على رقم الجوال الخاص بك 124792. برجاء إدخال الرمز"));
	}

	private static boolean check(String input, String alphnum) {
		System.out.print(input+": ");
		Pattern pattern = Pattern.compile(alphnum);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}

	public static String getTokenFromSms(String message) {
		String token = "";
		if (message == null)
			return token;
		message = message.replace(".", "");
		String regexAlphaNum = "^([0-9]+[a-zA-Z][0-9a-zA-Z]*)|([a-zA-Z]+[0-9][0-9a-zA-Z]*)$";
		String regexNum = "^[0-9][0-9]*$";
		System.out.println(Pattern.compile(regexNum).matcher("123456").find());
		//System.out.println(Pattern.compile(regexAlphaNum).matcher(message).group());
		
		Pattern pattern1 = Pattern.compile(regexAlphaNum);
		Pattern pattern2 = Pattern.compile(regexNum);
		for (String str:message.split(" ")) {
			Matcher matcher1 = pattern1.matcher(str);
			Matcher matcher2 = pattern2.matcher(str);

			//if( (matcher1.matches() ||matcher2.matches() ) && str.length() == 6)
			if(matcher1.matches() ||matcher2.matches())
			{
				token = str;
				break;
			}
		}
		return token;
	}

}
