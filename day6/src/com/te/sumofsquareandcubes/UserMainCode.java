package com.te.sumofsquareandcubes;

public class UserMainCode {
	public static int addEvenOdd(int arr[]) {
		int even =0;
		int odd = 0;
		int odd_sum = 0;
		int mean_sum = 0;
		int sum_even = 0;
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				even = arr[i]*arr[i];
				sum_even =sum_even + even;
			}
			else if(arr[i]%2!=0) {
				odd = arr[i] * arr[i] * arr[i];
				odd_sum+=odd;
				
			}
		}
		sum = sum_even + odd_sum;
		return sum;
	}

}
