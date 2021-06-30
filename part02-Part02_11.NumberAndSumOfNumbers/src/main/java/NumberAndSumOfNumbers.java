
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true){
            System.out.println("Give a number:");
            int numb = Integer.valueOf(scanner.next());

            if (numb != 0){
                count++;
                sum += numb;
            }else {
                System.out.println("Number of numbers: " + count);
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
        }

    }
}
