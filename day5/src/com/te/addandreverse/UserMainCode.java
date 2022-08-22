package com.te.addandreverse;

public class UserMainCode {
	public static int addAndReverse(int array[], int num) {
		int sum = 0;
		int rev = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > num) {

				sum += array[i];
		
			}

		}
		System.out.println("the sum of array is: " + sum);

		while (sum > 0) {
			rev = rev * 10 + (sum % 10);
			sum /= 10;
		}

		return rev;

	}
}
