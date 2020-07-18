package codeOnline30dayChallenge;

import java.util.Scanner;

public class Day26 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter degrees in centigrade:");
				double n = sc.nextDouble();
				double f = ( n*9/5) + 32;
				System.out.println("In Fahrenheit="+ f);
				sc.close();
				

	}

}
