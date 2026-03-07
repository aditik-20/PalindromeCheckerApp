import java.util.*;

public class PalindromeCheckerApp {

    boolean stackPalindrome(String text) {

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

    boolean reversePalindrome(String text) {

        String rev = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }

        return text.equals(rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeCheckerApp checker = new PalindromeCheckerApp();

        long start1 = System.nanoTime();
        boolean r1 = checker.stackPalindrome(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean r2 = checker.reversePalindrome(input);
        long end2 = System.nanoTime();

        System.out.println("Stack Method: " + (r1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("Reverse Method: " + (r2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        sc.close();
    }
}