package com.te.unique;

public class UserMainCode {
	public static int getUnique(int num) {

		int r1;
		int r2;
		int num1;
		int num2;
		num1 = num;
		num2 = num;
		int count = 0;
		
		while (num1 > 0) {
			r1 = num1 % 10;
			while (num2 > 0) {
				r2 = num2 % 10;
				if (r1 == r2) {
					count++;
				}
				num2 = num2 / 10;
			}
			num1 = num1 / 10;
		}
			
		return count;
	}

}
