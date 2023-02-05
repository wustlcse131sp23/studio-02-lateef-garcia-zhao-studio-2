package studio2;

import java.util.Scanner;

public class Gamblersruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter startAmount: ");
		double startAmount = in.nextDouble();
		System.out.println("Enter winChance: ");
		double winChance = in.nextDouble();
		System.out.println("Enter winLimit: ");
		double winLimit = in.nextDouble();
		
		while (startAmount < winLimit && startAmount > 0);
		{
			double winLose = Math.random();
			boolean winLose2 = winLose < winChance;

		}
		if (winLose2 = true)
			{
			startAmount += 1;	
			}
		else 
		{
		    startAmount -=1;
		}
		else (startAmount = 0)
		{System.out.println("ruin!");
		
	}

}
