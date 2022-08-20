package com.te.averageprmelocations;

public class UserMainCode {
	public static double averageElements(int[] given) {
		double sum=0;
		int count =0;
		double count1=0;
		double average=0;
		for (int i = 1; i < given.length; i++) {
			count=0;
			for (int j = 1; j <= i; j++) {
				if(i % j == 0)
					count ++;
					
				
			}
			if(count==2) {
				sum+=given[i];
				count1++;
				
			}
			 average = sum/count1;
			
		}
		
			
		return average;
		
		
	}

}