package com.te.kaprekar;

public class UserMainCodeKaprekar {
	public static int getKaprekar(int num) {
		int count=0;
		int temp=num;
		int square=num*num;
		int sum=0;
		int rem=0;
		int quo=0;
		while(num>0) {
			count++;
			num=num/10;
			
		}

			rem=square%(int)Math.pow(10 , count);
			quo=square/(int)Math.pow(10,count);
			
			sum=rem+quo;
			if(sum==temp)
				return 1;
			else
				return -1;
		}
			
		
	
		
	}


