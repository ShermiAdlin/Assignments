package com.te.array.commomelements;

public class UserMainCode {
	public static int sumCommonElements(int []first_array, int []second_array) {
		int sum=0;
		for (int i = 0; i < first_array.length; i++) {
			for (int j = 0; j < second_array.length; j++) {
				
			
			if(first_array[i]==second_array[j]) {
				sum=sum+first_array[i];
				
			}
				
		}
		
		}
	return sum;
 

	}
}
