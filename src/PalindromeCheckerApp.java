import java.util.*;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        char[] charArray = normalized.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Is Palindrom? :"+ isPalindrome(input));


        scanner.close();
    }
}
