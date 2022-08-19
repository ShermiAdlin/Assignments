package com.te.luckySum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=scanner.nextInt();
		System.out.println("Enter the second number");
		int b=scanner.nextInt();
		System.out.println("Enter the third number");
		int c=scanner.nextInt();
		int res=UserMainCode.getLuckySum(a,b,c);
		System.out.println("The lucky sum is : "+res);
	}

}
