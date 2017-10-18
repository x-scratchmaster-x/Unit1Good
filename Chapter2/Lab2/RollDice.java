package Lab2;

import java.util.Random;
public class RollDice {
	public static void main(String[] args){
		Random gen  = new Random();
		int die1 = gen.nextInt(6) + 1;
		int die2 = gen.nextInt(6) + 1;
		
		System.out.println("The dice rolled " + die1 + " and " + die2 + ".");
		System.out.println("Their sum is " + (die1 + die2) + ".");
	}
	
}
