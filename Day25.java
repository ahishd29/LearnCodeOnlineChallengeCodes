package codeOnline30dayChallenge;

import java.util.Scanner;

public class Day25 {
	
			static void isValid(String s) {
				int n = s.length();
				boolean flag = true;
				if(n<8) {
					System.out.println("Password must have atleast 8 characters.");
					flag = false;
				}
				if(flag) {
				int cnt=0;
				char[] ch = s.toCharArray();
				for(char c:ch) {
					if(Character.isDigit(c)) {
						cnt+=1;
					}
				}
				 if(cnt<2) {
					System.out.println("Password must have atleast 2 digits in it.");
					flag = false;
				}
				}
				if(flag) {
				for(int i=0; i<n;i++) {
					if(Character.isLetterOrDigit(s.charAt(i))==false) {
						flag = false;
					}
				}
				
				}
				if(flag) {
					System.out.println("Password is valid.");
				}
				else {
					System.out.println("Enter a valid password consists of only letters and digits.");
					
				}
			}
	
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a password:");
			String s = sc.next();
			isValid(s);
	}

}
