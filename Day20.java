package codeOnline30dayChallenge;

import java.util.Scanner;

public class Day20 {

	public static void main(String[] args) {
	Scanner s = new  Scanner(System.in);
	System.out.println("Enter a number to square:");
	int n = s.nextInt();
	for(int i=0; i<=1000;i++) {
		if(Math.sqrt(i)==Math.abs(n)) {
			System.out.println(i);
			break;
		}
	}
	s.close();
	}

}
