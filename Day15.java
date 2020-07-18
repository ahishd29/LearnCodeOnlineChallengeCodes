package codeOnline30dayChallenge;

public class Day15 {

	public static void main(String[] args) {
					float dvdPer=12f;
					float savingsPer=100-dvdPer;
					int dvd=42;
					float savings;
					float totalEarnings=(dvd/dvdPer)*100;
					savings=totalEarnings-dvd;
					System.out.println("Savings= $ "+savings);
	}

}
