package codeOnline30dayChallenge;

public class Day7 {

	public static void main(String[] args) {
				int eachDay=1200000;
				int eachYear=0;
				int n=365;
				while(n!=0) {
					eachYear+=eachDay;
					--n;
				}
				System.out.println(eachYear);

	}

}
