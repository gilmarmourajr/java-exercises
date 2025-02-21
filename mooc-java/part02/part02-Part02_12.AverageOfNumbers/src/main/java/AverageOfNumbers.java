
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0, numbers = 0;
        // double average = 0;
        
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }
            sum+=num;
            numbers++;
        }
        // average = sum/numbers;
        System.out.println("Average of the numbers: "+sum/numbers);
    }
}
