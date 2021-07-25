
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
        int games = 0;
        int wins = 0;
        int losses = 0;

        try {
            Scanner fileReader = new Scanner(Paths.get(file));

            while (fileReader.hasNext()) {
                String line = fileReader.nextLine();
                boolean containsTeam = line.contains(team);

                while (containsTeam) {
                    String[] parts = line.split(",");
                    games++;

                    if (parts[0].equals(team) && Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])
                            || parts[1].equals(team) && Integer.valueOf(parts[3]) > (Integer.valueOf(parts[2]))) {
                        wins++;
                    } else if (containsTeam) {
                        losses++;
                    }
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
