
/***4. Check if a Number is Armstrong**

Write a program to check if a three-digit number is an **Armstrong number**. A number is Armstrong if:

Sum of cubes of digits=Number itself\text{Sum of cubes of digits} = \text{Number itself}

Sum of cubes of digits=Number itself

Example: `153 = 1³ + 5³ + 3³` */

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three-digit number: ");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        int count = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + (int) Math.pow(rem, 3);
            n = n / 10;
            count++;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }

    }
}
