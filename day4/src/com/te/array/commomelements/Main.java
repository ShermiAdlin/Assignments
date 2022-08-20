 package com.te.array.commomelements;

import java.util.Scanner;

public class Main {
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the array size");
		int size=scanner.nextInt();
		System.out.println("Enter the first array");
		int [] first_array= new int[size];

		for (int i = 0; i < first_array.length; i++) {
			first_array[i] =scanner.nextInt();
		}
		System.out.println("Enter the second array");
		int [] second_array = new int[size];
		for (int i = 0; i < second_array.length; i++) {
			second_array[i]= scanner.nextInt();
		}
				
		int res= UserMainCode.sumCommonElements(first_array,second_array);
		System.out.println(res);
	}

}
