import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal (P): ");
        double P = sc.nextDouble();
        System.out.print("Enter Rate of Interest (r): ");
        double r = sc.nextDouble();
        System.out.print("Enter Number of Years (n): ");
        int n = sc.nextInt();
        double CI = P * Math.pow(1 + r / 100, n) - P;
        System.out.println("Compound Interest: " + CI);
    }
}

