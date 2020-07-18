package codeOnline30dayChallenge;

import java.util.Scanner;

public class Day23 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter an integer value:");
				int n = sc.nextInt();
				String x = " ";
				while(n>0) {
					int a = n%2;
					x = a+x;
					n/=2;
				}
				System.out.println(x);
	}

}
