package com.te.removetens;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
   Scanner scanner=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int size=scanner.nextInt();
	System.out.println("ENTER THE ARRAY");
	int [] given=new int [size];
	for (int i = 0; i < given.length; i++) {
		  given[i]=scanner.nextInt();
		
	}
	int res[] = UserMainCode.removeTens(given);
	for (int i = 0; i < given.length; i++) {
		System.out.println(res[i]);
	}
}
}
