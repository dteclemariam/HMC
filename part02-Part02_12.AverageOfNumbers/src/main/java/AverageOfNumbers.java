
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0.00;

        while (true){
            System.out.println("Give a number:");
            int numb = Integer.valueOf(scanner.next());

            if (numb != 0){
                count++;
                sum += numb;
            }else{
                double avg = Double.valueOf(sum/count);
                System.out.println("Average of the numbers: " + avg);
                break;
            }
        }

    }
}
