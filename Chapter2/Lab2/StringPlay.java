package Lab2;

//**************************************************
//StringPlay.java
//
//Play with String objects
//**************************************************
public class StringPlay
{
public static void main (String[] args)
{
     String college = new String ("PoDunk College");

     String town = "Anytown, USA";

     int stringLength;
     String change1, change2, change3;
  
     stringLength = college.length();
   
     System.out.println (college + " contains " + stringLength + " characters.");

     change1 = college.toUpperCase();; // part (c)

     change2 = change1.replace('O', '*');; // part (d)

     change3 = college.concat(town); // part (e)

     System.out.println ("The final string is " + change3);
   }
}