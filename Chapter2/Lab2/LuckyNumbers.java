package Lab2;

//**************************************************
//LuckyNumbers.java
//
//To generate two random "lucky" numbers
//**************************************************

import java.util.Random;

public class LuckyNumbers
{
public static void main (String[] args)
{
     Random generator = new Random();
     int lucky1, lucky2; 

     // Generate lucky1 (a random integer between 50 and 79) using the nextInt method

     lucky1 = 50 + generator.nextInt(20);

     // Generate lucky2 (a random integer between 11 and 30) using nextFloat

     lucky2 = (int)( 11.0 + (generator.nextFloat() * 20.0));

     System.out.println ("Your lucky numbers are " + lucky1 + " and " + lucky2);
   }
}