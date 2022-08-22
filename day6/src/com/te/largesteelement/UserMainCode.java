package com.te.largesteelement;

public class UserMainCode {
public static int checkLargestAmoungNumber(int arr[]) {
	
   int first = arr[0];
   int middle = arr[arr.length/2];
   int last = arr[arr.length-1];
   
   
   System.out.println("first element "+ first);
   System.out.println("middle element"+ middle);
   System.out.println("last element "+ last);
   
   
   int res = (first>((middle>last)?middle:last)?first:((middle>last)?middle:last));
   return res;
	
}
}

