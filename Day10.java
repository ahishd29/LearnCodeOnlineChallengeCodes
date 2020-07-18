package codeOnline30dayChallenge;

public class Day10 {

	public static void main(String[] args) {
				int totalMiles=2052;
				int totalDays=6;
				int townsPerDay=2;
				int avgBetweenStops=(totalMiles/(totalDays*townsPerDay));
				System.out.println(avgBetweenStops*1.6+ " km between towns");

	}

}
