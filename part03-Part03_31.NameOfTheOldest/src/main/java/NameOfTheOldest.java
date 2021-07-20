
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentOldest = 0;
        String nameOfOldest = "";

        while (true){
            String input = scanner.nextLine();
            if (input.isEmpty()){
                break;
            }

            String [ ] parts = input.split(",");

            if (Integer.valueOf(parts[1]) > currentOldest){
                nameOfOldest = parts[0];
                currentOldest = Integer.valueOf(parts[1]);
            }
        }
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}
