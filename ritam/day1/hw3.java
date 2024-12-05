/***3. Pre/Post-Increment**

Write a program to demonstrate the difference between pre-increment and post-increment operators:

- Declare an integer and increment it using both `++a` and `a++`.
- Print the value before and after the increment for both operations.
 */

package day1;
import java.util.*;
import java.util.Scanner;
public class hw3 {
    public static void main(String args[]){
        int a = 10;
        System.out.println("Before increment the default value of a is:" + a);
        System.out.println("After post-increment the value of a is:" + a++);
        System.out.println("After pre-increment the value of a is:" + ++a);
    }
}
