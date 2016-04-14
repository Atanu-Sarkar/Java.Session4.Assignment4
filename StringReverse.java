package com.acadgild.session.four;

public class StringReverse {

	public static void main(String[] args) {
		String string="atanusarkar";
	      String reverse = new StringBuffer(string).
	      reverse().toString();
	      
	      System.out.println("String before reverse: "+ string);
	      System.out.println("String after reverse: "+ reverse);
	}

}
