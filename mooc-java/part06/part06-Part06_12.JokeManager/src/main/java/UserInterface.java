
import java.util.Scanner;

public class UserInterface {
    private JokeManager joker;
    private Scanner sc;
    
    public UserInterface(JokeManager joker, Scanner sc) {
        this.joker = joker;
        this.sc = sc;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = sc.nextLine();

            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String joke = sc.nextLine();
                this.joker.addJoke(joke);
                
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(this.joker.drawJoke());

            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                this.joker.printJokes();
            }
        }
    
    }
}
