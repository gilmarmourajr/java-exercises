
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        Statistics numbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();
        
        System.out.println("Enter numbers:");
        int input = scanner.nextInt();
        while(input!=-1){
            numbers.addNumber(input);
            
            if(input%2==0){
                evenNumbers.addNumber(input);
            } else{
                oddNumbers.addNumber(input);
            }
            
            input = scanner.nextInt();
        }
        System.out.println("Sum: "+numbers.sum());
        System.out.println("Sum of even numbers: "+evenNumbers.sum());
        System.out.println("Sum of odd numbers: "+oddNumbers.sum());
    }
}
