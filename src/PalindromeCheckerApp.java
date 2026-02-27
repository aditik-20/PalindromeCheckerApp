import java.util.*;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text : ");
        String input = sc.nextLine();
        Deque<Character> dq = new ArrayDeque<>();
        boolean palindrome = true;

        for(char c : input.toCharArray()){
            dq.addLast(c);
        }
        while(dq.size() > 1){
            char first = dq.removeFirst();
            char second = dq.removeLast();
            if(first != second) palindrome = false;
            break;
        }
        System.out.println("Is Palindrome? :" + palindrome);
    }
}


