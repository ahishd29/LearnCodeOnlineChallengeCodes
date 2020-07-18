package codeOnline30dayChallenge;

public class Day4 {

	public static void main(String[] args) {
				
			int totalHotDogs=1;
			int hotDogsInEachPackage=8;
			int totalBags=0;
			while(totalHotDogs<=400) {
				totalBags=totalBags+1;
				totalHotDogs+=hotDogsInEachPackage;
			}
			System.out.println(totalBags);
//		int tH=400;
//		int hDPC=8;
//		int tC=0;
//		int temp=tH+hDPC;
//		while(temp>hDPC) {
//			temp=temp-hDPC;
//			tC++;
//		}
//		System.out.println(tC);
	}

}
