import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();
        
        int vowels = 0, consonants = 0;
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

