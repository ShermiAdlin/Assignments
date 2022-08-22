package com.te.middleofarray;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scanner.nextInt();
		if(size%2==0) {
			System.out.println("enter odd element");
		}
		else {
		int []arr = new int[size];
		
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int res = UserMainCode.getMiddleElement(arr);
		System.out.println("The middle element is "+res);
		}
	}

}
