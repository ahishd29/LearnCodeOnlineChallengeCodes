package codeOnline30dayChallenge;
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=10;i++) {
			int mul = num * i;
			System.out.println(num+"x"+i+"="+mul);
		}
					

	}

}
