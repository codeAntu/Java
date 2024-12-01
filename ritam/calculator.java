import java.util.*;
import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("The sum of the"+num1+"and"+num2+"is: "+sum);
        if(num1>=num2){
            int substract = num1-num2;
            System.out.println("The substraction of"+num1+"ans"+num2+"is: "+substract);
        } else {
            int substract = num2-num1;
            System.out.println("The substraction of"+num1+"ans"+num2+"is: "+substract);
        }
        int multiplication = num1*num2;
        System.out.println("The multiplication of"+num1+"ans"+num2+"is: "+multiplication);
    }
}