
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int last = Integer.valueOf(scanner.next());
        int start = 1;
        int result = 1;

        while (start<= last){
            result *= start;
            start++;
        }
        System.out.print("Factorial: " + result);

    }
}
