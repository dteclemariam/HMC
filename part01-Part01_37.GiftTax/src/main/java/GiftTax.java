
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int val = Integer.valueOf(scan.next());

        if (val < 5000){
            System.out.println("No tax!");
        }else if (val < 25000){
            System.out.println("Tax: " + (100 + (val - 5000) * 0.08 ));
        } else if (val <= 55000){
            System.out.println("Tax: " + (1700 + (val - 25000) * 0.10));
        }else if (val <= 200_000){
            System.out.println("Tax: " + (4700 + (val - 55000) * 0.12));
        }else if (val <=1000_000){
            System.out.println("Tax: " + (22100 + (val - 200_000) * 0.15));
        }else{
            System.out.println("Tax: " + (142_100 + (val - 1000_000) * 0.17));
        }

    }
}
