package com.te.diffbwnlargeandsmall;

public class UserMainCode {
	
public static int getBigDiff(int[] b) {
	int max=b[0];
	int min=b[0];
	int diff=0;
	
	for (int i = 0; i < b.length; i++) {
		if(max<b[i]) {
			max=b[i];
		}
	}
	for (int i = 0; i < b.length; i++) {
		if(min>b[i])
			min=b[i];
		
	}
	diff=max-min;
	return diff;
	
}
}
