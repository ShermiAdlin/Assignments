package com.te.sumofsquareandcubes;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		int []arr = new int [size];
		System.out.println("enter the array element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			
		}
		int res = UserMainCode.addEvenOdd(arr);
		System.out.println(res);
		
	}

}
