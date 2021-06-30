
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true){
            System.out.println("Give a number:");
            int numb = Integer.valueOf(scanner.next());

            if (numb != 0){
                sum += numb;
            }else{
                System.out.println("Sum of the numbers: " + sum);
                break;
            }
        }

    }
}
