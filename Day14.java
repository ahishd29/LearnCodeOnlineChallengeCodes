package codeOnline30dayChallenge;

import java.util.Arrays;

public class Day14 {

	
//				int n=5;
//				int r=2;
//				int d=n-r;
//				int a=num(n);
//				int b=denom(d);
//				int result=a/b;
//				System.out.println(result);
//	}
//	public static int num(int n) {
//		if(n==1) {
//			return 1;
//		}
//		else {
//			return n*num(n-1);
//		}
//	}
//	public static int denom(int d) {
//		if(d==1) {
//			return 1;
//		}
//		else {
//			return d*denom(d-1);
//		}
//	}
		public static void comb(String[] sA, int start) {
				for(int i=start; i<sA.length; i++) {
					String temp=sA[start];
					sA[start]=sA[i];
					sA[i]=temp;
					comb(sA, start+1);
					sA[i]=sA[start];
					sA[start]=temp;
				}
				if(start==sA.length-1)
				{
					System.out.println(Arrays.deepToString(sA));
				}
	
	
	
	}
		public static void main(String[] args) {
			String studentArray[]= {"Ram", "Anuj", "Deepak", "Ravi"};
			comb(studentArray,0);		}
		

}
