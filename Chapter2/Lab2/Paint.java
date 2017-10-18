package Lab2;

//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************

public class Paint
{
      public static void main(String[] args)
      {
          final int COVERAGE = 350;  //paint covers 350 sq ft/gal
          int length, width, height;
          //declare integers length, width, and height;
          double totalSqFt, paintNeeded;
          //declare double totalSqFt;
          //declare double paintNeeded;
          
          //Declare and initialize the length of the room
          length = 15;
          //Declare and initialize the width of the room
          width = 11;       
          //Declare and initialize the height of the room
          height = 8;
          //Compute the total square feet to be painted--think
          //about the dimensions of each wall
          totalSqFt = (2 * length * height + 2 * width * height + width*length);
          paintNeeded = totalSqFt / 350;
          //Compute the amount of paint needed

          //Print the length, width, and height of the room and the
          System.out.println("Width: " + width  + "     Height: " + height + "      Length: " + length);
          System.out.println("Paint needed: " + paintNeeded + " gallons" );
          //number of gallons of paint needed.
      }
}