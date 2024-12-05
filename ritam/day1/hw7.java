/***7. Count Vowels and Consonants**

Write a program that counts the number of vowels and consonants in a given string. Ignore spaces and non-alphabet characters.

Example:

- Input: `"Hello World!"`
- Output:
    - Vowels: 3
    - Consonants: 7 */

package day1;
import java.util.*;
import java.util.Scanner;
public class hw7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        int vowels = 0;
        int consonants = 0;
        char[] arr = input.toLowerCase().toCharArray();
        System.out.println(arr);;
        for (int i = 0; i < input.length(); i++) {
            char c = arr[i];
            if(c >= 'a' && c <= 'z'){
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("The total number of vowel is:" + vowels);
        System.out.println("The total number of consonant is:" + consonants);
    }
}
