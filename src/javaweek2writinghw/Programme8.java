package javaweek2writinghw;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */

public class Programme8 {

    public static void main(String[] args) {
        ////Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the Triangle: ");
        int length = scanner.nextInt();
        System.out.println("Please enter the height if the Triangle: ");
        int height = scanner.nextInt();
        areaOfTriangle(height,length);
        //Closing the scanner object
        scanner.close();
    }
    //Calculating the area of triangle with no return type with parameter method
    public  static void areaOfTriangle(int length, int height){
        int area = (length*height)/2;
        System.out.println("The Area of a triangle is: " + area);
    }
}
