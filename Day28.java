package codeOnline30dayChallenge;

import java.util.Scanner;

public class Day28 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter no. of minutes:");
				int min=sc.nextInt();
				int minPerYear=(60*24*365)+(6*60);
				float year = (float)min/minPerYear;
				System.out.println("In years= "+year);
				sc.close();
	}

}
