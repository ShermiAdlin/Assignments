package com.te.median;
import java.util.Scanner;

public class Main {

	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
	System.out.println("Enter the size of an array");
	int size= scanner.nextInt();
	
	System.out.println("Enter the elements");
	int array[]=new int[size];
	
	for (int i = 0; i < size; i++) {
		array[i]=scanner.nextInt();
	}
	
	int result =UserMainCode.findMedian(array);
	System.out.println("The Median of array element is : "+result);

	}
		

}
