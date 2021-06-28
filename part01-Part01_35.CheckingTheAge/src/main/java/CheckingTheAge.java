
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.next());

        if (age <= 120 && age >= 0){
            System.out.println("Ok");
        }else{
            System.out.println("Impossible!");
        }

    }
}
