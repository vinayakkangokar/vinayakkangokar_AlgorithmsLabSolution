package PayMoney;

import java.util.Scanner;

public class AchieveTarget {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array");
		int sizeTargets = in.nextInt();
		
		System.out.println("Enter the Values of array ");
		int[] arrTargets = new int[sizeTargets];
		for(int i=0; i< sizeTargets; i++) {
			arrTargets[i] = in.nextInt();
		}
		
		System.out.println("Enter the total number of Targets that needs to be Achieved ");
		int numOfTargetsToBeAchieved = in.nextInt();
		
		
		for(int i=0; i < numOfTargetsToBeAchieved; i++) {
			System.out.println("Enter the Value of Target");
			int valOfTargetsToBeAchieved = in.nextInt();

			Target targetAchieve = new Target();
			targetAchieve.PayMoney(arrTargets, numOfTargetsToBeAchieved, valOfTargetsToBeAchieved);
			
		}
		
		in.close();
		
		
	}

}
