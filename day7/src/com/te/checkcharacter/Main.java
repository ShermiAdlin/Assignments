package com.te.checkcharacter;
import java.util.Scanner;
public class Main {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the word");
			String given = scanner.nextLine();
			int res = UserMainCode.checkCharacters(given);
			if(res ==1) {
				System.out.println("Valid");
			}
			else {
				System.out.println("Invalid");
			}
			
		}

	}

