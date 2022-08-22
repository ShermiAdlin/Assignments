package com.te.removetens;

public class UserMainCode {
	public static int[] removeTens(int[] num) {
		int count=0;
	
		for ( int i = 0; i < num.length; i++) {
			if(num[i]==10)
				num[i]=0;
		
				
			System.out.println(num[i]);
		}
		for (int i = 0; i < num.length; i++) {
			
		
			if(num[i]==0) {
				for (int k = 0; k < num.length; k++) {
					if(num[i]!=0) {
						num[i] = num[k];
						num[k]=0;
						i++;
					}
					
				}
			}
				
			
			
		}
	
	return num;
	}
}
	
