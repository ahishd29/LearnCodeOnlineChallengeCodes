package codeOnline30dayChallenge;

public class Day9 {
	
static void Calc(int nSweaters, int eachSweaterCost, int nComputerGame, int eachComputerGameCost, int nBracelets, int eachBraceletCost, int refund, int rebate) {
		
		int totalCost=(nSweaters*eachSweaterCost) + (nComputerGame*eachComputerGameCost) + (nBracelets*eachBraceletCost);
		int finalCost=totalCost-refund-rebate;
		System.out.println(finalCost);
}

	public static void main(String[] args) {
//		Day9 ob = new Day9();
		int nSweaters=3;
		int eachSweaterCost=68;
		int nComputerGame=1;
		int eachComputerGameCost=75;
		int nBracelets=2;
		int eachBraceletCost=43;
		int refund=43;
		int rebate=10;
		Calc(nSweaters, eachSweaterCost, nComputerGame,eachComputerGameCost,  nBracelets, eachBraceletCost, refund, rebate);
	}
	
		
		

}
