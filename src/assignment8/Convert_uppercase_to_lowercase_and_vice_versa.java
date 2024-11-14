
package assignment8;
import java.util.*;

public class Convert_uppercase_to_lowercase_and_vice_versa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        StringBuilder convert = new StringBuilder();
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(Character.isUpperCase(c)){
                convert.append(Character.toLowerCase(c));
            }else{
                convert.append(Character.toUpperCase(c));
            }
        }
        System.out.println("Convert: " + convert);
    }
}
