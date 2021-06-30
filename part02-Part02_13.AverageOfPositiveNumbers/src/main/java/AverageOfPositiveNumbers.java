
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;

        while (true){
            System.out.printf("Give a number:");
            int numb = Integer.valueOf(scanner.next());

            if (numb == 0 && count == 0){
                System.out.println("Cannot calculate the average");
                break;
            }else if (numb > 0){
                count++;
                sum += numb;
            }else if (numb == 0){
                System.out.println(sum/count);
                break;
            }
        }

    }
}
