import java.util.*;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text : ");
        String input = sc.nextLine();
       Stack<Character> st = new Stack<>();
       Queue<Character> q = new LinkedList<>();
       for(char c : input.toCharArray()){
           q.add(c);
           st.push(c);
       }

       boolean palindrome = true;
       while(q.size()>0){
           if(q.poll() != st.pop()){
               palindrome = false;
               break;
           }
       }
        System.out.println("Is Palindrom? :" +palindrome);

    }
}


