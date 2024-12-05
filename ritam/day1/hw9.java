/*9. Multiplication Table

Write a program that prints the **multiplication table** for a number entered by the user (from 1 to 10). */

package day1;
import java.util.*;
import java.util.Scanner;
public class hw9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10:");
        int num = scanner.nextInt();
        int i;
        if (num >=1 && num <= 10){
            for( i=1;i<=10;i++){
                System.out.println(num+"*"+i+"="+(num*i));
            }
        }
    }
}
