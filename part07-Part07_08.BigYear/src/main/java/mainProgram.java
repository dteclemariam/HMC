
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdManager birdManager = new BirdManager();

        while (true){
            System.out.print("?");
            String command = scan.nextLine();

            if (command.equals("Quit")){
                break;
            }

            if (command.equals("Add")){
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                birdManager.addBird(new Bird(name, latinName));
            }

            if (command.equals("Observation")){
                System.out.print("Bird? ");
                String name = scan.nextLine();
                Bird bird = birdManager.getBird(name);
                if (bird != null){
                    bird.addObservation();
                }else {
                    System.out.println("Not a bird!");
                }
            }

            if (command.equals("All")){
                ArrayList<Bird> birds = birdManager.getBirds();
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            }

            if (command.equals("One")){
                System.out.print("Bird? ");
                String name = scan.nextLine();
                Bird bird = birdManager.getBird(name);
                if (bird != null){
                    System.out.println(bird);
                }else{
                    System.out.println("Not a bird!");
                }
            }
        }
    }
}
