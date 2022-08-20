package com.te.largestElement; 

public class UserMainCode {
	public static int checkLargestAmoungCorner(int num[]) {
		int first_array= num[0];
		int middle_array= num[num.length/2];
		int last_array=num[num.length-1];
		
		System.out.println("first element : "+first_array);
		System.out.println("middle element : "+middle_array);
		System.out.println("third element : "+last_array);
		
		int large= first_array>((middle_array>last_array)?middle_array:last_array)?first_array:((middle_array>last_array)?middle_array:last_array);
		return large;
	}

}
