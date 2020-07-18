package codeOnline30dayChallenge;

import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the floppy disk's free memory in bytes:");
		int f = sc.nextInt();
		System.out.println("Enter the floppy disk's used memory in bytes ");
		int u = sc.nextInt();
		System.out.println("Enter the size of file in bytes which you are deleting:");
		int o = sc.nextInt();
		System.out.println("Enter the size of file in bytes which you are creating:");
		int n = sc.nextInt();
		f+=o;
		f-=n;
		System.out.println("Floppy disk is having free memory of:"+f+ " bytes");
	}

}
