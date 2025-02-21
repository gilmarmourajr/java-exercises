
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0, numbers = 0;
        // double average = 0;
        
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }
            
            if(num>0){
                sum+=num;
                numbers++;                
            }
        }
        // average = sum/numbers;
        if(numbers == 0){
            System.out.println("Cannot calculate the average");
        } else{
            System.out.println("Average of the numbers: "+sum/numbers);
        }
    }
}
