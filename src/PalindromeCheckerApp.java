import java.util.*;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text : ");
        String input = sc.nextLine();
       Stack<Character> st = new Stack<>();
       for(int i = 0 ; i < input.length();i++){
           st.push(input.charAt(i));
       }
//        System.out.println(st);
        StringBuilder sb = new StringBuilder();
        while(st.size()!=0){
            sb.append((st.pop()));
        }
        String reverse = sb.toString();
        if(input.equals(reverse)){
            System.out.println("Is Palindrome? true");
        }else{
            System.out.println("Is Palindrome? false");
        }
    }
}


