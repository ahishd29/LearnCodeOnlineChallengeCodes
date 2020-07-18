package codeOnline30dayChallenge;

import java.util.Scanner;

public class Day27 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter cm value:");
				float cm = sc.nextFloat();
				System.out.println(cm+ " cm in inch= "+ (cm/2.54f)+" inch");
				System.out.println(cm+ " cm in meter= "+ (cm/100)+ " m");
				System.out.println(cm+ " cm in kilometer= "+ (cm/100000)+" km");
	}

}
