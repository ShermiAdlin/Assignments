package com.te.checkcharacter;

public class UserMainCode {
	public static int checkCharacters(String given) {
		char first = given.charAt(0);
		System.out.println(first);
		char last =given.charAt (given.length()-1);
		System.out.println(last);
		if(first==last) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
