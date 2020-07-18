package codeOnline30dayChallenge;

public class Day8 {

	public static void main(String[] args) {
				
		float[] arr = {8,10,9,8,7,12};
		int n=arr.length;
		float sum = 0;
		for(float i: arr) {
			sum+=i;
		}
		float avg=sum/n;
		System.out.println("Average no. of hours worked per nurse on this day is:"+ avg);
	}

}
