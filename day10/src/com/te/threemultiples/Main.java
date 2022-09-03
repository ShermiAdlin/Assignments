package com.te.threemultiples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter the size");
		int size = scanner.nextInt();
		System.out.println("Enter the array list");
		for (int i = 0; i < size; i++) {
			
		
		list.add(scanner.nextInt());
		}
		System.out.println(UserMainCode.removeMultiplesOfThree(list,size));
	}

}
