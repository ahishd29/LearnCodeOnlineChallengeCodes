package codeOnline30dayChallenge;



public class Day21 {
	static int calcAngle(double h, double m) {
		if(h<0 || m<0 || h>12 || m>60) {
			System.out.println("wrong i/p");
		}
		if(h==12) {
			h=0;
		}
		if(m==60) {
			m=0;
		}
		int hour_ang = (int)(0.5*(h*60+m));
		int min_ang = (int)(6*m);
		int ang = Math.abs(hour_ang-min_ang);
		ang=Math.min(360-ang, ang);
		return ang;
	}

	public static void main(String[] args) {
					System.out.println(calcAngle(12,10)+" degree");
					System.out.println(calcAngle(12,50)+" degree");
					
					
					
	}
	
}
