package com.te.largesteelement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scanner.nextInt();
		if(size%2==0) {
			System.out.println("enter odd number");
		}
			else {
				int []array = new int [size];
				for (int i = 0; i < array.length; i++) {
					array[i] = scanner.nextInt();
				}
				int res = UserMainCode.checkLargestAmoungNumber(array);
			
		System.out.println(" the largest number is "+ res);
			}
				
		}
	}


