/***8. Compare Strings Using `==` and `.equals()`**

Write a program that compares two strings in the following ways:

1. Using the `==` operator
2. Using the `.equals()` method

In the program:

- Initialize two strings using both ways:
    - **First String:** `"hello"`
    - **Second String:** `"hello"`
    - **Third String:** `"world"`

The program should check:

1. If the two strings `"hello"` and `"hello"` are **equal** using both `==` and `.equals()`.
2. If the two strings `"hello"` and `"world"` are **equal** using both `==` and `.equals()`.

### **Expected Output:**

- Print whether the strings `"hello"` and `"hello"` are equal using `==` and `.equals()`.
- Print whether the strings `"hello"` and `"world"` are equal using `==` and `.equals()`. */

package day1;
import java.util.*;
import java.util.Scanner;
public class hw8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        System.out.println("Enter the third string: ");
        String str3 = sc.nextLine();
        if(str1 == str2){
            System.out.println("The strings "+str1+" and "+str2+" are equal using ==");
        } else {
            System.out.println("The strings "+str1+" and "+str2+" are not equal using ==");
        }
        if(str1.equals(str2)){
            System.out.println( "The strings "+str1+" and "+str2+" are equal using .equals()");
        } else {
            System.out.println("The strings "+str1+" and "+str2+" are not equal using .equals()");
        }

        if(str1 == str3){
            System.out.println("The strings "+str1+" and "+str3+" are equal using ==");
        } else {
            System.out.println("The strings "+str1+" and "+str3+" are not equal using ==");
        }
        if(str1.equals(str3)){
            System.out.println("The strings "+str1+" and "+str3+" are equal using .equals()");
        } else {
            System.out.println("The strings "+str1+" and "+str3+" are not equal using .equals()");
        }
    }
}

/*confuse*/