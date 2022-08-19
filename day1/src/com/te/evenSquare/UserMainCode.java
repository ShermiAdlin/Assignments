package com.te.evenSquare;

public class UserMainCode {

	public static int SumOfSquaresOfEvenDigits(int num) {
		int last= 0;
		int square = 1;
		int sum = 0;
		while(num>0) {
			last=num%10;
			if (last % 2 == 0) {
				
				square=last*last;
				sum=sum+square;

			}
	
			num=num/10;
		}
		return sum;
	}
}
