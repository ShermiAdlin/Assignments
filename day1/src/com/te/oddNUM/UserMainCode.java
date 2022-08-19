package com.te.oddNUM;

public class UserMainCode {
	public static int checkSum(int gn) {
		int digits=0;
		int sum=0,last=0;
		 while(gn>0) {
			 last=gn%10;
			 if(last%2!=0) {
				 sum=sum+last;
			 }
			 gn=gn/10;
	
		 }
		if(sum%2!=0)
			return 1;
		else 
			return -1;
			
		}
	}
		
	


