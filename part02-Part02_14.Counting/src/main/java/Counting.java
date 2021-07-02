
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int numb = Integer.valueOf(scanner.next());

        while (i <= numb){
            System.out.println(i);
            i++;
        }

    }
}
