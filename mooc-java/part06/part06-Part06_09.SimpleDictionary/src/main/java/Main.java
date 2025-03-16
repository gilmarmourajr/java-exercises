
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        Scanner sc = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        
        TextUI textui = new TextUI(sc, dictionary);
        
        System.out.println("oi");
        textui.start();
        
    }
}
