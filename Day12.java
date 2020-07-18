package codeOnline30dayChallenge;

public class Day12 {

	public static void main(String[] args) {
					int wbc=5000000;
					int rbc=8000;
					int factor = greatestCommonFactor(wbc, rbc);
					int wRatio = wbc/factor;
					int rRatio = rbc/factor;
					int ratio = wbc/rbc;
					System.out.println("Aspect Ratio:"+ wRatio + ":"+ rRatio);

	}
	public static int greatestCommonFactor(int wc, int rc) {
		return (rc==0)? wc : greatestCommonFactor(rc, wc%rc);
	}

}
