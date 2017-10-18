package Lab1;

//****************************************************************
//Rock.java
//
//Play Rock, Paper, Scissors with the user
//     
//****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
static char playerChar;
static char computerPlay;

public static String checkState(char c, char p){
	if (p == 'R') {
		   if (c == 'S') {
			   return "You Win!";
		   } else if  (c == 'R') {
			   return "Tie!";
		   }
		   return "You Lose!";
	} else if (p == 'P') {
		if (c == 'R') {
			   return "You Win!";
		   } else if  (c == 'P') {
			   return "Tie!";
		   }
		   return "You Lose!";
	}
	if (c == 'P') {
		   return "You Win!";
	   } else if  (c == 'S') {
		   return "Tie!";
	   }
	   return "You Lose!";
}
public static void main(String[] args)
{ //User's play -- "R", "P", or "S"
   //Computer's play -- "R", "P", or "S"
   int computerInt;      //Randomly generated number used to determine
                         //computer's play
   Random generator = new Random();
   //Get player's play -- note that this is stored as a string
   //Make player's play uppercase for ease of comparison
   //Generate computer's play (0,1,2)
   //Translate computer's randomly generated play to string
   //Print computer's play
   //See who won.
   char[] moves = new char[3]; 
   moves[0] = 'R';
   moves[1] = 'P';        //DEFINING THE CHAR LIST!
   moves[2] = 'S';
   Scanner scan = new Scanner(System.in);
   System.out.print("User plays: ");
   String playerMove = scan.next();
   playerChar = playerMove.charAt(0);
   computerPlay = moves[generator.nextInt(3)];
   System.out.println("The computer moves " + computerPlay + ".");
   System.out.println("The game ends: " + checkState(computerPlay, playerChar));

   
}
}
