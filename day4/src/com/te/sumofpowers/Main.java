package com.te.sumofpowers;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the array size");
		//int [] given= {3,6,2,1};
		int size=scanner.nextInt();
		System.out.println("Enter the array");
		int[] given =new  int[size];
		for (int i = 0; i < given.length; i++) {
			given[i]= scanner.nextInt();
	}
		//System.out.println(4);
			int res=UserMainCode.getSumOfPower(given);
			System.out.println(res);
			
		
		
	}

}
