package com.te.squareOfDigits;

public class UserMainCode {
public static int getSumOfSquaresOfDigits(int num) {
	int last=0;
	int square=0;
	int sum=0;
	while(num>0) {
		last=num%10;
		square=last*last;
		sum=sum+square;
		num=num/10;
		square=0;
	}
	return sum;
	
}
}
