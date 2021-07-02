
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb = Integer.valueOf(scanner.next());

        while (numb <=100){
            System.out.println(numb);
            numb++;
        }

    }
}
