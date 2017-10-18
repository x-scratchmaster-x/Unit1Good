package Lab1;

//****************************************************************
//Guess.java
//
//Play a game where the user guesses a number from 1 to 10
//         
//****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess
{
public static void sayNext(){
	System.out.println("Do a number.");
}
public static String compareNums(int guess, int real){
	if (guess > real)  return "high";
	return "low";
}
public static void main(String[] args)
   {
     String state;
     int numToGuess;           //Number the user tries to guess
     int guess = -1;                //The user's guess
     String response;
     Scanner scan = new Scanner(System.in);
     Random generator = new Random();

     numToGuess = generator.nextInt(10) + 1;
     //randomly generate the  number to guess

     //print message asking user to enter a guess

     //read in guess 
     String[] responses = new String[5];
     responses[0] = "Wrong.";
     responses[1] = "Its terrible, trust me.";
     responses[2] = "You have the WORST numbers, trust me, they are terrible.";
     responses[3] = "Your number is FAKE NEWS.";
     responses[4] = "My numbers are the best, trust me, you will never have them.";
     
    // sayNext();
     //guess = scan.nextInt();
     while (guess != numToGuess)  //keep going as long as the guess is wrong
     {
     sayNext();
     guess = scan.nextInt();
     response = responses[generator.nextInt(5)];
     
     state = compareNums(guess, numToGuess);
     if (guess != numToGuess) System.out.println(response + " Your number is far too " + state + ".");
     System.out.println("");//print message saying guess is wrong
             //get another guess from the user
     }
     System.out.println("Congradulations. Your number, " + guess + ", is going to make America great again.");
     //print message saying guess is right
   }
}
