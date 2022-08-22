package sumandduplicateelements;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		int [] array = new int [size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
 		}
		int res=UserMainCode.sumElements(array);
		
			System.out.println(res);
		}
	}


