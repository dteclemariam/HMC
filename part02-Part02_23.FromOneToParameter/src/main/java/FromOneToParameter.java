import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lastNumber = Integer.valueOf(scanner.next());

        printUntilNumber(lastNumber);

    }

    private static void printUntilNumber(int lastNumber) {
        int i = 1;

        while(i <= lastNumber){
            System.out.println(i);
            i++;
        }

    }

}
