
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.next());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.next());
        System.out.println(first + " + " + second + " = " + (first + second) );
        System.out.println(first + " - " + second + " = " + (first - second) );
        System.out.println(first + " * " + second + " = " + (first * second) );
        //Can't use
        System.out.println(first + " / " + second + " = " + (Double.valueOf(first) / Double.valueOf(second)));

    }
}
