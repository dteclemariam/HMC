
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeManager recipeManager = new RecipeManager();
        UserInterface ui = new UserInterface(scanner, recipeManager);
        ui.start();


/*        try {
            Scanner fileReader = new Scanner(Paths.get("recipes.txt"));
            while (fileReader.hasNextLine());
            String line = fileReader.nextLine();
            System.out.println(line);
            //linesFromFile.add(line);
        }catch (Exception e){
            System.out.println("There was a problem reading the file recipes.txt");
        }*/

/*        try {
            Scanner scanner = new Scanner(Paths.get("recipes.txt"));
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }*/
    }

}
