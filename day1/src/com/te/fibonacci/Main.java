package com.te.fibonacci;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scanner.nextInt();
		int res=UserMainCode.getSumOfNfibos(n);
		System.out.println("the sum of fibonacci is: "+res);
		
	}

}
