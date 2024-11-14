
package assignment8;
import java.util.*;

public class Count_the_number_of_words_in_a_string {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        int count = text.length();
        System.out.print("Count the number of words in a string: " + count);
    }
}
