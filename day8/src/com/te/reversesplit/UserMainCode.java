package com.te.reversesplit;

public class UserMainCode {
	public static String reShape(String given , char ch) {
		String rev = "";
		String str = "";
		String result ="";
		
		for (int i = given.length()-1;  i>=0; i--) {
			rev = rev+ given.charAt(i);
			
		}
		//StringBuffer sb = new StringBuffer(rev);
		System.out.println(rev);
		for (int i = 0; i < given.length(); i++) {
			//sb = sb.insert(i, ch);
			str =str+rev.charAt(i)+ch;
		}
	
		System.out.println(result = str.substring(0,given.length()+(given.length()-1)));
	return result;

}
}
