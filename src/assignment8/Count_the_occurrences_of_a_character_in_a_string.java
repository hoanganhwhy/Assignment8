package assignment8;
import java.util.*;

public class Count_the_occurrences_of_a_character_in_a_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        int count = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == character){
                count++;
            }
        }
        System.out.println(count + " of a '" + character + "' in a string '" + text + "'");
    }
    
}
