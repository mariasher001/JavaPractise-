import java.util.Scanner;

/**
 * ALGORITHM:To check if a string is palindrome or not ,
 * 1)reverse the string
 * 2)compare it with the given string
 * 3)see if they are equal if yes, then its palindrome else not!
 */
public class Main {


    public static void main(String[] args) {
        PalindromeString pd = new PalindromeString();
        String reverseStr = "";
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter a string to check if it's palindrome!");
        //String str = scanner.next();
        System.out.println("Please enter an Integer to check if it's palindrome!");
        int Number = scanner.nextInt();
        ///pd.PalindromeDetector(str);
        pd.IntegerPalindromeDetector(Number);

    }
}