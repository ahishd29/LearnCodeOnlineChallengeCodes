package codeOnline30dayChallenge;

import java.util.*;
import java.util.Scanner;

public class Day16 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter n value: ");
				int n = sc.nextInt();
				System.out.println();
				List<Integer> l = new ArrayList<>();
				while(n!=0) {
					int rem = n%10;
					l.add(rem);
					n/=10;
				}
				int sum = 0;
				for(int i:l) {
					sum+=i;
				}
				System.out.println("Sum = "+sum);

	}

}
