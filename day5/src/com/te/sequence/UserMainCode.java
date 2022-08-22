package com.te.sequence;

public class UserMainCode {
	
		public static boolean checkSequence(int [] array) {
			boolean check=false;
			
			for (int i = 0; i < array.length; i++) {
				if(i-2==array.length-3)
					break;
				if((array[i]==1) && (array[i+1]==2) && (array[i+2]==3))
				{
					check=true;
					break;
				}
			}
			return check;
			
		}

	}

