
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");

        int lastNumb = Integer.valueOf(scanner.next());
        int sum = 0;
        int count = 0;

        while (count <= lastNumb){
            sum += count;
            count++;
        }

        System.out.println("The sum is " + sum  );

    }
}
