package codeOnline30dayChallenge;

import java.util.Scanner;

public class Day29 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter distance in meters:");
				int met = sc.nextInt();
				System.out.println("Enter time in hours, minutes and seconds:");
				int h=sc.nextInt();
				int m=sc.nextInt();
				int s=sc.nextInt();
				double mH=(double)m/60;
				double sH=(double)s/3600;
				double metToMile=(double)met/1609;
				double time = (double)h+mH+sH;
				double speed = (double)(metToMile/time);
				System.out.println("Speed in miles per hour= "+speed);
				sc.close();

	}

}
