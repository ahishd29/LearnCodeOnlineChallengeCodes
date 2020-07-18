package codeOnline30dayChallenge;

import java.util.Scanner;

public class Day13 {

	public static void main(String[] args) {
					int kara=5;
					int rani=7;
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter k value:");
					int k = sc.nextInt();
					System.out.println("Enter r value:");
					int r = sc.nextInt();
					int tKara=kara*k;
					int tRani=rani*r;
					if(tKara==tRani) {
						System.out.println("Both Kara & Rani has made same amount of money.");
					}
					else if(tKara>tRani) {
						System.out.println("Kara made more money of " + tKara + " Rupees" + " & it is more than "+ (tKara-tRani)+" Rupees than Rani");
					}
					else {
						System.out.println("Rani made more money of " + tRani + " Rupees"+ " & it is more than "+ (tRani-tKara)+" Rupees than Kara");
					}
	}

}
