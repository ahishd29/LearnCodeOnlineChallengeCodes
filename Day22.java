package codeOnline30dayChallenge;

import java.util.Scanner;

public class Day22 {
	static int isLeap(int year) {
		if((year%4==0 && year%100!=0) || (year%400==0)) {
		   return 1;
		}
		else return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = sc.nextInt();
		int res = isLeap(year);
		if(res==1) {
			System.out.println(year+ " is a leap year");
		}
		else {
			System.out.println(year+ " is not a leap year");
		}
		
		
		
				

	}

}
