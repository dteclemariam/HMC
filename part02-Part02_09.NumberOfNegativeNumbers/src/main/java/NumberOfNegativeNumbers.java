
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true){
            System.out.println("Give a number:");
            int numb = Integer.valueOf(scanner.next());
            if (numb < 0){
                count++;
                continue;
            }else if (numb > 0){
                continue;
            }
            System.out.println("Number of negative numbers: " + count);
            break;
        }

    }
}
