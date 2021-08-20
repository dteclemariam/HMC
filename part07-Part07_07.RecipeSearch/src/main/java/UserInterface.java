import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private RecipeManager recipeManager;
    private ArrayList<Recipe> recipes;

    public UserInterface(Scanner scanner, RecipeManager recipeManager){
        this.scanner = scanner;
        this.recipeManager = recipeManager;
    }

    public void start(){
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        System.out.println("");
        recipeManager.readRecipesFromFile(fileName);
        recipes = recipeManager.getRecipesList();
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
                case "find cooking time":
                    searchByCookingTime();
                    break;
                case "find ingredient":
                    searchByIngredient();
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
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
    }

    private void listRecipes(){
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe.toString());
        }
        System.out.println("");
    }

    private void searchByName(){
        System.out.print("Searched word: ");
        String searchWord = scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(searchWord)){
                System.out.println(recipe.toString());
            }
        }
        System.out.println("");
    }

    private void searchByCookingTime(){
        System.out.print("Max cooking time: ");
        int maxTime = Integer.parseInt(scanner.nextLine());
        System.out.println("");
        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxTime){
                System.out.println(recipe.toString());
            }
        }
        System.out.println("");
    }

    private void searchByIngredient(){
        ArrayList<String> ingredients;
        System.out.print("Ingredient: ");
        String searchWord = scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            ingredients = recipe.getIngredients();
            if (ingredients.contains(searchWord)){
                System.out.println(recipe.toString());
            }
        }
        System.out.println("");
    }
}
