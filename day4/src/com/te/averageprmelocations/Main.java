package com.te.averageprmelocations;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scanner.nextInt();
		System.out.println("Enter the array");
		int[] given= new int[size];
		
		for (int i = 0; i < given.length; i++) {
			given[i]=scanner.nextInt();
			
		}
		double res=UserMainCode.averageElements(given);
		System.out.println(res);
			
	
	}

}
