import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeManager gradeManager;

    public UserInterface(Scanner sc, GradeManager gm) {
        this.scanner = sc;
        this.gradeManager = gm;
    }

    public void start() {
        readPoints();
        printStats();
    }

    private void readPoints() {
        System.out.println("Enter points total, -1 stops:");
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());

            if (point == -1) {
                break;
            }

            if (point > 100 || point < 0) {
                continue;
            }
            gradeManager.add(point);
        }
    }

    private void printStats() {
        System.out.println("Point average (all): " + gradeManager.averagePoints());
        printAveragePassingPoints();
        printPassPercentage();
        printGradeDistribution();
    }

    private void printAveragePassingPoints(){
        String nonePassed = "-";
        double stats = gradeManager.averagePassingPoints();

        if (stats == 0.0){
            System.out.println("Point average (passing): " + nonePassed);
        }else {
            System.out.println("Point average (passing): " + stats);
        }
    }

    private void printPassPercentage(){
        System.out.println("Pass percentage: " + gradeManager.passPercentage());
    }

    private void printGradeDistribution(){
        int currentGrade = 5;
        System.out.println("Grade distribution: ");

        for (int i = currentGrade; i >= 0; i--) {
            int amountOfStars = gradeManager.getNumbersOfGrade(i);
            System.out.print(i + ": ");
            printStars(amountOfStars);
            System.out.println("");
        }
    }

    private void printStars(int stars){
        int amountOfStarsToPrint = stars;
        while (amountOfStarsToPrint > 0){
            System.out.print("*");
            amountOfStarsToPrint--;
        }
    }
}
