
import java.util.Scanner;

public class TextUI {
    private Scanner sc;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner sc, SimpleDictionary dictionary) {
        this.sc = sc;
        this.dictionary = dictionary;
    }
    
    public void start() {
        System.out.println("Command: ");
        String input = sc.nextLine();
        
        while(!input.equals("end")) {
            
            if(input.equals("add")) {
                this.add();
            } else if(input.equals("search")) {
                this.search();
            } else {
                System.out.println("Unknown command.");
            }
            
            System.out.println("Command: ");
            input = sc.nextLine();
        }
        
        System.out.println("Bye bye!");
    }
    
    public void add() {
        System.out.println("Word: ");
        String word = sc.nextLine();
                
        System.out.println("Translation: ");
        String translation = sc.nextLine();
                
        this.dictionary.add(word, translation);
    }
    
    public void search() {
        System.out.print("To be translated: ");
        String word = sc.nextLine();
        String translation = this.dictionary.translate(word);
        
        if(translation == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + translation);
        }
    }
}
