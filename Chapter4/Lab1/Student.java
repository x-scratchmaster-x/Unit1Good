package Lab1;
// ****************************************************************
//  Student.java
//
//  Define a student class that stores name, score on test 1, and
//  score on test 2.  Methods prompt for and read in grades,
//  compute the average, and return a string containing student's info.
//****************************************************************
import java.util.Scanner;
public class Student
{
   //declare instance data
	String name;
	double grade_1;
	double grade_2;
	
	Scanner gen = new Scanner(System.in);
   //-----------------------------------------------
   //constructor
   //-----------------------------------------------
   public Student(String studentName)
   {
	   	this.name = studentName;
       //add body of constructor
   }
   //-----------------------------------------------
   //inputGrades: prompt for and read in student's grades for test1 and test2.
   //Use name in prompts, e.g., "Enter's Joe's score for test1".
   //-----------------------------------------------
   public void inputGrades()
   {
	   System.out.print("Grade on test one: ");
	   this.grade_1 = gen.nextDouble();
	   System.out.println();
	   System.out.print("Grade on test two: ");
	   this.grade_2 = gen.nextDouble();
	   System.out.println();
       //add body of inputGrades
   }
   //-----------------------------------------------
   //getAverage: compute and return the student's test average
   //-----------------------------------------------
   //add header for getAverage
   public double getAverage()
   {
	   return (this.grade_1 + this.grade_2)/2;
       //add body of getAverage
   }
   //-----------------------------------------------
   //getName: return the student's name
   //-----------------------------------------------
   //add header for getName
   public String getName()
   {	
	   return this.name;
       //add body of getName
   }
   //-----------------------------------------------
   //printName: print the student's name
   //-----------------------------------------------
   //add header for printName
   public void printName()
   {
	   System.out.println("Name: " + this.name);
       //add body of printName
   }
}


