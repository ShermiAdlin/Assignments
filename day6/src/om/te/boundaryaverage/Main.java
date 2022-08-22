package om.te.boundaryaverage;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the elemenr");
		int size = scanner.nextInt();
		int []arr = new int[size];
		System.out.println("enter the array element");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			
		}
		float res = UserMainCode.getBoundaryAverage(arr);
		System.out.println("THe boundary average is "+ res );
		
	}

}
