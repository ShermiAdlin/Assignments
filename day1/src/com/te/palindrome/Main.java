package com.te.palindrome;

import java.util.Scanner;

public class Main extends UserMainCode {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the upper limit");
		int pal1=scanner.nextInt();
		System.out.println("Enter the ending range");
		int pal2=scanner.nextInt();
		System.out.println(addPalindrome(pal1,pal2));
	}

}
