
package assignment8;
import java.util.*;

public class Split_words_in_a_string {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        System.out.println("The sentences in the string are: ");
        System.out.print("[");
        for(String word : words) {
            System.out.println(word);
        }
        System.out.print("]");
    }
}
