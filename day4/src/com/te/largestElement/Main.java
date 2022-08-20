package com.te.largestElement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scanner.nextInt();
		if(size%2==0)
			System.out.println("Please enter odd number");
		else {
			
		System.out.println("Enter the array");
		int [] given = new int[size];
		for (int i = 0; i < given.length; i++) {
			given[i]=scanner.nextInt();
			
		}
		int res=UserMainCode.checkLargestAmoungCorner(given);
		System.out.println(res);
		
	}
	}
}
