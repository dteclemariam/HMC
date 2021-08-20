import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private RecipeManager recipeManager;

    public UserInterface(Scanner scanner, RecipeManager recipeManager){
        this.scanner = scanner;
        this.recipeManager = recipeManager;
    }

    public void start(){
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        System.out.println("");
        recipeManager.readRecipesFromFile(fileName);
        printCommands();
        boolean running = true;
        while (running){
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            System.out.println("");

            switch (command){
                case "list":
                    listRecipes();
                    break;
                case "stop":
                    running = false;
                    break;
                case "find name":
                    searchByName();
                    break;
                default:
                    continue;
            }
        }
    }

    private void printCommands(){
        System.out.println("Commands:");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("");
    }

    private void listRecipes(){
        System.out.println("Recipes:");
        ArrayList<Recipe> recipesList = recipeManager.getRecipesList();
        for (Recipe recipe : recipesList) {
            System.out.println(recipe.toString());
        }
        System.out.println("");
    }

    private void searchByName(){
        ArrayList<Recipe> recipesList = recipeManager.getRecipesList();
        System.out.print("Searched word: ");
        String searchWord = scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : recipesList) {
            if (recipe.getName().contains(searchWord)){
                System.out.println(recipe.toString());
            }
        }
        System.out.println("");
    }


}
