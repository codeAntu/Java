/***5. Calculate the Length of a String**

Write a program that accepts a string from the user and prints its **length** (number of characters).
 */

package day1;
import java.util.*;
import java.util.Scanner;
public class hw5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        int length = str.length();
        System.out.println("The length of the string is: " + length);
    }
}
