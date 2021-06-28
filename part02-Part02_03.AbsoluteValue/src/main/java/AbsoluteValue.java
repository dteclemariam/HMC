
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = Integer.valueOf(scanner.next());

        if (numb > 0){
            System.out.println(numb);
        }else{
            System.out.println(numb * -1);
        }

    }
}
