/***2. Compound Interest Calculator**

Write a program to calculate **Compound Interest** using the formula:

CI=P×(1+r100)n−PCI = P \times \left(1 + \frac{r}{100}\right)^n - P

CI=P×(1+100r)n−P

where:

- PPP: Principal amount
- rrr: Rate of interest per year
- nnn: Number of years */

package day1;
import java.util.*;
import java.util.Scanner;
public class hw2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double p = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double r = sc.nextDouble();
        System.out.println("Enter the number of years: ");
        int n = sc.nextInt();
        double ci = p * Math.pow((1 + r / 100), n) - p;
        System.out.println("The compound interest is: " + ci);
        }
    }

