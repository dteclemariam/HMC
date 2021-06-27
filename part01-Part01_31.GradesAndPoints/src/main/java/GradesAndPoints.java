
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int numb = Integer.valueOf(scan.next());
        if (numb < 0){
            GradesAndPoints.print("impossible");
        }else if (numb <= 49){
            GradesAndPoints.print("failed");
        }else if (numb <= 59){
            GradesAndPoints.print(1);
        }else if (numb <= 69){
            GradesAndPoints.print(2);
        }else if (numb <= 79){
            GradesAndPoints.print(3);
        }else if (numb <= 89){
            GradesAndPoints.print(4);
        }else if (numb <= 100){
            GradesAndPoints.print(5);
        }else{
            GradesAndPoints.print("Incredible");
        }

    }

    private static void print(int number){
        System.out.println("Grade: " + number);
    }

    private static void print(String text){
        System.out.println("Grade: " + text);
    }
}
