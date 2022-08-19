package com.te.evenOddIdex;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int given=scanner.nextInt();
		int res=UserMainCode.sumOfOddEvenPositioned(given);
		if(res==1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
