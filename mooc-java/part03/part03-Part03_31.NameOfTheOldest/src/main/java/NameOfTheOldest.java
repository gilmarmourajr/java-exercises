
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        String oldestName = "";

        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[] inputSplit = input.split(",");
            
            if(oldestAge == 0){
                oldestAge = Integer.valueOf(inputSplit[1]);
                oldestName = inputSplit[0];
            }
            
            if(Integer.valueOf(inputSplit[1])>oldestAge){
                oldestAge = Integer.valueOf(inputSplit[1]);
                oldestName = inputSplit[0];
            }
        }
        
        System.out.println("Name of the oldest: "+oldestName);


    }
}
