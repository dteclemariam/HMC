
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sum = 0.0;
        String longestName = "";

        while (true){
            String input = scanner.nextLine();
            if (input.isEmpty()){break;}

            String [] parts = input.split(",");
            count++;
            sum += Double.valueOf(parts[1]);

            if (parts[0].length() > longestName.length()){
                longestName = parts[0];
            }
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (sum/count));
    }
}
