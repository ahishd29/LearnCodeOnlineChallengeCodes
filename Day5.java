package codeOnline30dayChallenge;

public class Day5 {

	public static void main(String[] args) {
				int[] a= {66,57,54,53,64,52,59};
				int n=a.length;
				for(int i=0;i<n-1;i++) {
					for(int j=0;j<n-1-i;j++) {
						if(a[j+1]<a[j]) {
							int temp=a[j+1];
							a[j+1]=a[j];
							a[j]=temp;
						}
					}
					
				}
				
				System.out.println("The best score of Shoshanna is:"+a[n-1]);
				

	}

}
