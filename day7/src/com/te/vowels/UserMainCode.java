package com.te.vowels;

public class UserMainCode { 
	public static String removeEvenVowels(String given) {
		String res = "";
		for (int i = 0; i < given.length(); i++) {
			String check = given.substring(i, i+1);
			if ((check.equals("a") || check.equals("e") || check.equals("i") || check.equals("o") || check.equals("u"))
					&& i % 2 == 1)
				res = res + "";
			else
				res = res + check;

		}
		return res;
			
			
		}
	}


