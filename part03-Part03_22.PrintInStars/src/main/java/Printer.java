
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int outerCounter = 0;

        while (outerCounter < array.length){
            int innerCounter = 0;
            int number = array[outerCounter];
            outerCounter++;

            while (innerCounter < number){
                System.out.print("*");
                innerCounter++;
            }
            System.out.println("");
        }
    }

}
