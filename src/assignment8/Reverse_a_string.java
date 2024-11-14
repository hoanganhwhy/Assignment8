
package assignment8;
import java.util.*;

public class Reverse_a_string {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        String reverse = new StringBuilder(text).reverse().toString();
        System.out.print("Reverse of string: " + reverse);
    }
}
