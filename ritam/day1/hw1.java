/***1. Area of a Rectangle**

Write a program that calculates the **area** of a rectangle. The program should take the **length** and **width** as input and print the result.

- Formula: `Area = length * width` */

package day1;

import java.util.*;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        float length = sc.nextFloat();
        System.out.print("Enter the width of the rectangle: ");
        float width = sc.nextFloat();
        float area = length * width;
        System.out.println("The area of the rectangle is:" + area);
    }
}
