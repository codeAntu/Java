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
        char[] arr = str.toLowerCase().toCharArray();
        int length = str.length();
        int i;
        int count =0;
        for(i=0;i<length;i++){
            char c = arr[i];
            if(c>='a' && c<='z'){
                count++;
            }
        }
        System.out.println("The length of the string is: " + count);
    }
}
