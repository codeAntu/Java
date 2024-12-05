/***6. String Reversal**

Write a program to reverse a string without using any built-in reverse functions.

For example:

- Input: `"hello"`
- Output: `"olleh"` */

package day1;
import java.util.*;
import java.util.Scanner;
public class hw6{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}