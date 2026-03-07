import java.util.*;

public class PalindromeCheckerApp {

    boolean checkPalindrome(String text) {

        int n = text.length();

        char[] stack = new char[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            stack[++top] = text.charAt(i);
        }

        for (int i = 0; i < n; i++) {
            char ch = stack[top--];

            if (text.charAt(i) != ch) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        sc.close();

    }
}