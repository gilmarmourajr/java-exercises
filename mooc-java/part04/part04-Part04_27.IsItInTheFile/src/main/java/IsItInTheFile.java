
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        Boolean found = false;
        try(Scanner read = new Scanner(Paths.get(file))){
            while(read.hasNextLine()){
                if(read.nextLine().contains(searchedFor)){
                    found = true;
                    break;
                }
            }
        } catch (Exception e){
            System.out.println("Reading the file "+file+" failed.");
        }
        
        if(found){
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

    }
}
