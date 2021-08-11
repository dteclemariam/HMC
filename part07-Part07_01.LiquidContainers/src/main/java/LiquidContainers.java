
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int max = 100;
        int min = 0;


        while (true) {
            System.out.println("First: " + first + "/" + max);
            System.out.println("Second: " + second + "/" + max);
            System.out.print("> ");

            String input = scan.nextLine();
            int amount = 0;
            String parts [] = null;

            if (input.equals("quit")) {
                break;
            }

            boolean partsNotNull = false;
            //Finding out if the string is splittable with space
            if (input.contains(" ")){
                parts = input.split(" ");
                amount = Integer.valueOf(parts[1]);
                partsNotNull = (parts != null);
            }

            //Started doing contains but that kind of messed up the remove/move so doing part[].equals instead.
            //Should add a parts =! inn all the ifs to not get a NullPointerException,
            //or just makes classes with methods that handles this. But that is not the point of this exercise.

            //Adding to first container
            if (parts[0].equals("add") && amount > 0){
                first = (first + amount) < max? first + amount : max;
            }

            //first != 0: Move cannot be performed if there are noting to be moved
            if (parts[0].equals("move") && amount > 0 && first != 0) {
                if (amount > first) {
                    second = second +  first < max ? second + first : max;
                    first = 0;
                } else {
                    first = (first - amount) > 0 ? first - amount : min;
                    second = (second + amount) < max ? second + amount : max;
                }
            }

            //Removing from second container as long as the value of the container is greater than 0
            if (parts[0].equals("remove") && second > 0){
                second = (second - amount) > 0? second - amount : 0;
            }
        }
    }
}
