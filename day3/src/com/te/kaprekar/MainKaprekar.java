package com.te.kaprekar;
import java.util.Scanner;

public class MainKaprekar {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int given=scanner.nextInt();
		int res=UserMainCodeKaprekar.getKaprekar(given);
		if(res==1)
			System.out.println("kaprekar number");
		else
			System.out.println("Not kaprekar number");
	}

}
