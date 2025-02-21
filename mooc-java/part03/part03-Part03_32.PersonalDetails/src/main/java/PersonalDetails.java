
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumBirth = 0, numPeople = 0;
        String longestName = "";
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[] inputSplit = input.split(",");
            
            if(inputSplit[0].length()>longestName.length()){
                longestName = inputSplit[0];
            }
            
            sumBirth += Integer.valueOf(inputSplit[1]);
            numPeople ++;
        }
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: "+(1.0 * sumBirth / numPeople));
        
    }
}
