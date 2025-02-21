
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
            
            if(list.size() == 1){
                greatest = input;
            }
            
            if(input > greatest){
                greatest = input;
            }            
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        
        System.out.println("The greatest number: "+greatest);
         
    }
}
