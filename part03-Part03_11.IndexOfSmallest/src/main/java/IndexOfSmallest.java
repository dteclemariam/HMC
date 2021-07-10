
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.next());
            if (input != 9999) {
                list.add(input);
            } else {
                break;
            }
        }

        int currentSmallestNumber = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            currentSmallestNumber = currentSmallestNumber < list.get(i) ? currentSmallestNumber : list.get(i);
        }

        System.out.println("Smallest number: " + currentSmallestNumber);

        for (int i = 0; i < list.size(); i++) {
            if (currentSmallestNumber == list.get(i)) {
                System.out.println("Found at index " + i);
            }
        }


        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
    }
}
