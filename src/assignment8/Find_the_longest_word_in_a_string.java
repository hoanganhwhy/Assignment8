
package assignment8;
import java.util.*;

public class Find_the_longest_word_in_a_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.println("Sentence: '" + text + "'");
        String[] words = text.split("\\s+");
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        System.out.println("Longest word: '" + longestWord + "'");
       
    }
}
