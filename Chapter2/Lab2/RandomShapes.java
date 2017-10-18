package Lab2;


//****************************************************************
//RandomShapes.java
//
//The program will draw two filled rectangles and a
//filled oval positioned randomly on the screen.
//****************************************************************

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class RandomShapes extends Applet
{
   public void paint (Graphics page)
   {
	 Random generator = new Random();
     // Declare size constants
     final int MAX_SIZE = 300;
     final int PAGE_WIDTH = 600;
     final int PAGE_HEIGHT = 400;

     // Declare variables
     int x, y;        // x and y coordinates of upper left-corner of each shape
     int width, height; // width and height of each shape

     // Set the background color
     setBackground (Color.yellow);

     // Set the color for the next shape to be drawn
     page.setColor (Color.blue);

     // Assign the corner point and width and height
     x = generator.nextInt(PAGE_WIDTH);
     y = generator.nextInt(PAGE_HEIGHT);
     width = 50 + generator.nextInt(MAX_SIZE);
     height = 50 + generator.nextInt(MAX_SIZE);
     //System.out.println(x + " " + y);
     // Draw the rectangle
     page.fillRect(x, y, width, height);
     
     page.setColor (Color.green);

     // Assign the corner point and width and height
     x = generator.nextInt(PAGE_WIDTH);
     y = generator.nextInt(PAGE_HEIGHT);
     width = 50 + generator.nextInt(MAX_SIZE);
     height = 50 + generator.nextInt(MAX_SIZE);
     //System.out.println(x + " " + y);
     // Draw the rectangle
     page.fillRect(x, y, width, height);
     
     page.setColor (Color.red);

     // Assign the corner point and width and height
     x = generator.nextInt(PAGE_WIDTH);
     y = generator.nextInt(PAGE_HEIGHT);
     width = 50 + generator.nextInt(MAX_SIZE);
     height = 50 + generator.nextInt(MAX_SIZE);
     //System.out.println(x + " " + y);
     // Draw the rectangle
     page.fillOval(x, y, width, height);
   }
}