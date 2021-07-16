
import java.util.ArrayList;
import java.util.List;

public class Sum {

    public static void main(String[] args) {
        // Try your method here

    }

    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for (int number : numbers) {
            sum+= number;
        }
        return sum;
    }

}
