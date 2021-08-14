
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeManager gradeManager = new GradeManager();
        UserInterface userInterface = new UserInterface(scanner, gradeManager);
        userInterface.start();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
