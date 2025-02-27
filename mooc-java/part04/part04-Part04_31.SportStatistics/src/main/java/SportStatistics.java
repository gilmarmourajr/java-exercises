
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int games = 0, wins = 0, losses = 0;
        
        try(Scanner read = new Scanner(Paths.get(file))){
            while(read.hasNextLine()){
                String parts[] = read.nextLine().split(",");
                
                int teamPoints = 0;
                int opposingPoints = 0;
                if(parts[0].equals(team)){
                    teamPoints = Integer.valueOf(parts[2]);
                    opposingPoints = Integer.valueOf(parts[3]);
                } else if(parts[1].equals(team)){
                    teamPoints = Integer.valueOf(parts[3]);
                    opposingPoints = Integer.valueOf(parts[2]);
                } else {
                    continue;
                }
                
                games++;
                if(teamPoints>opposingPoints){
                    wins++;
                } else{
                    losses++;
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: "+games);
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+losses);
    }

}
