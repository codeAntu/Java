/***11. Sum of Elements in a 2D Array**

Write a program that calculates the sum of all elements in a 2D array.

Example:

- Input:
    
    ```
    Copy code
    1 2 3
    4 5 6
    7 8 9
    ```
    
- Output: `45` */

package day1;
import java.util.*;
import java.util.Scanner;
public class hw11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the colum size: ");
        int col = sc.nextInt();
        System.out.print("enter the row size: ");
        int row = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("enter the array element: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The input array is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of all elements in the 2D array is: " + sum);       
    }
}
