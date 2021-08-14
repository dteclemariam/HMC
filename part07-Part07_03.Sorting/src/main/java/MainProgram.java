import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int [] array){
        int smallest = array[0];
        for (int numb : array) {
            smallest = smallest < numb? smallest : numb;
        }
        return smallest;
    }

    public static int indexOfSmallest(int [] array){
        int indexOfSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[indexOfSmallest]){
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int [] array, int startIndex){
        int indexOfSmallest = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < array[indexOfSmallest]){
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int [] array, int index1, int index2){
        int holderVariable = array[index1];
        array[index1] = array[index2];
        array[index2] = holderVariable;
    }

    public static void sort(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallest = indexOfSmallestFrom(array, i);
            swap(array, i, smallest );
        }
    }

}
