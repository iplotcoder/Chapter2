//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 import java.util.Scanner;
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            int length;
            int width;
            int height;
            //declare double totalSqFt;
            double totalSqFt;
            //declare double paintNeeded;
            double paintNeeded;
            //declare window and doors;
            int windows;
            int doors;
            double windowsSqFeet;
            double doorsSqFeet;
            //Declare and initialize the length of the room
            length = 15;
            //Declare and initialize the width of the room
            width = 11;
            //Declare and initialize the height of the room
            height = 8;
            //Declare and initialize the total number of windows and doors and square feet of window and doors
            windows = 2;
            doors = 1;
            windowsSqFeet = 15;
            doorsSqFeet = 20;
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            totalSqFt = ((length * width) + 2 * (width * height) + 2 * (length * height)) - ((windows * windowsSqFeet) + (doors * doorsSqFeet));
            //Compute the amount of paint needed
            paintNeeded = totalSqFt / 350;
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
            System.out.println("The length is: " + length);
            System.out.println("The width is: " + width);
            System.out.println("The height is: " + height);
            System.out.println("The number of gallons of paint needed is: " + paintNeeded + " gallons");
        }
}