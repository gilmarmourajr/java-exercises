
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallest = 0;

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 9999){
                break;
            }
            
            list.add(input);
            
            if(list.size() == 1){
                smallest = input;
            }
            
            if(input < smallest){
                smallest = input;
            }
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        System.out.println("Smallest number: "+smallest);
        for(int i=0; i<list.size(); i++){
            if(smallest == list.get(i)){
                System.out.println("Found at index: "+i);
            }
        }

        
    }
}
