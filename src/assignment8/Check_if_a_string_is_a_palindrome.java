
package assignment8;
import java.util.*;

public class Check_if_a_string_is_a_palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        String reverse = new StringBuilder(text).reverse().toString();
        if(text.equals(reverse)){
            System.out.println("Palindrome!");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
