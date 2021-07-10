
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.print("Search for? ");
        int numberToFind = Integer.valueOf(scanner.next());
        int currentIndex = 0;
        for (int currentNumber : list) {
            if (currentNumber == numberToFind){
                System.out.println(numberToFind + " is at index " + currentIndex);
            }
            currentIndex++;
        }
    }
}
