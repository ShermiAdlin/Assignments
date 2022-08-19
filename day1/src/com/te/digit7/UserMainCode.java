package com.te.digit7;

public class UserMainCode {
	public static int countSeven(int num) {
		int last = 0;
		int digit = 0;
		while (num > 0) {
			last = num % 10;
			if (last == 7) {
				digit++;
			}
			num = num / 10;
		}
		return digit;
	}
}
