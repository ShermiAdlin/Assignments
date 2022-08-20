package com.te.sumofpowers;

public class UserMainCode {
	public static int getSumOfPower(int num[]) {
		int sum=0;
		for (int i = 0; i < num.length; i++) {
			sum+=(int)(Math.pow(num[i], i));
			
		}
		return sum;
	}

}
