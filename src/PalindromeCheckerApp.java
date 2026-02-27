import java.util.*;

public class PalindromeCheckerApp {

    static boolean palidrome(String s , int start , int end){
        if(start >= end) return  true;
        if(s.charAt(start)!=s.charAt(end)) return false;
        return palidrome(s,start+1,end -1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text : ");
        String input = sc.nextLine();


        System.out.println("Is Palindrom? :"+ palidrome(input,0,input.length()-1));

        sc.close();
    }
}