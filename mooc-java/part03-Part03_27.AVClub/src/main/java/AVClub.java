
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[] inputSplit = input.split(" ");
            for(int i=0; i<inputSplit.length; i++){
                if(inputSplit[i].contains("av")){
                    System.out.println(inputSplit[i]);
                }
            }
        }


    }
}
