import java.util.*;
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text : ");
        String input = sc.nextLine();
        char arr[] = input.toCharArray();
        int n = input.length();
        boolean status = true;
        for(int i = 0 ; i < n/2 ; i++){
            if(arr[i] != arr[n - i - 1]){
                status = false;
            }
        }

            System.out.println("Is Palindrom: " + status);




    }
}


