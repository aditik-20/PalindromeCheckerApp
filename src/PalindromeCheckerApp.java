import java.util.*;

interface PalindromeStrategy {
    boolean isPalindrome(String text);
}

class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String text) {

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
}

class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String text) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : text.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    PalindromeStrategy strategy;

    PalindromeCheckerApp(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    boolean checkPalindrome(String text) {
        return strategy.isPalindrome(text);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Choose Strategy: 1.Stack  2.Deque");
        int choice = sc.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        PalindromeCheckerApp checker = new PalindromeCheckerApp(strategy);

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }

        sc.close();
    }
}