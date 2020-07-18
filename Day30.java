package codeOnline30dayChallenge;

import java.util.Scanner;

public class Day30 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter two numbers:");
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				System.out.println("Sum = "+(n1+n2));
				System.out.println("Difference ="+(n1-n2));
				System.out.println("Product = "+(n1*n2));
				System.out.println("Average = "+(n1+n2)/2);
				System.out.println("Maximum = "+ Math.max(n1, n2));
				System.out.println("Minimum = "+ Math.min(n1, n2));
	}

}
