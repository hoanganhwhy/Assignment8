
package assignment8;
import java.util.*;

public class Remove_extra_spaces_in_a_string {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: "); 
        String text = scanner.nextLine();

        System.out.println("Original with spaces: '" + text + "'");

        text = text.trim().replaceAll("\\s+", " ");
        System.out.println("After removing extra spaces: '" + text + "'");
    }
}
