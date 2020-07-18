package codeOnline30dayChallenge;

public class Day18 {

	public static void main(String[] args) {
		int[] ar = {12,13,8,10,17};
		int f = Math.max(ar[0], ar[1]);
		int s = Math.max(ar[2], ar[3]);
		int t = Math.max(f,s);
		int fin=Math.max(t, ar[4]);
		System.out.println(fin);
//		int max = ar[0];
//		for(int i: ar) {
//			if(i>max) {
//				max=i;
//			}
//		}
//		System.out.println(max);
	}

}
