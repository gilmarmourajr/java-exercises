
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0, amount = 0, even = 0, odd = 0;
        double average = 0;
        
        System.out.println("Give numbers:");
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            
            if(number == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            
            if(number%2==0){
                even++;
            } else {
                odd++;
            }
            sum+=number;
            amount++;
        }
        average = Double.valueOf(sum)/amount;

        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+amount);
        System.out.println("Average: "+average);
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
