import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager {
    private ArrayList<Recipe> recipes = new ArrayList<>();

    public RecipeManager() {}

    //read lines from the file
    public void readRecipesFromFile(String fileName) {
        ArrayList<String> linesFromFile = new ArrayList<>();

        try {
            Scanner fileReader = new Scanner(Paths.get(fileName));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                linesFromFile.add(line);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        createRecipesFromList(linesFromFile);
    }

    //turn lines to recipes
    private void createRecipesFromList(ArrayList<String> lineFromFile) {
        String name = "";
        int cookingTime= 0;
        ArrayList<String> ingredients = new ArrayList<>();
        int lastLine = lineFromFile.size() - 1;

        for (String line : lineFromFile) {

            if (!line.isEmpty() && Character.isUpperCase(line.charAt(0))){
                name = line;
            }

            if (!line.isEmpty() && Character.isDigit(line.charAt(0))){
                cookingTime = Integer.valueOf(line);
            }

            if (!line.isEmpty() && Character.isLowerCase(line.charAt(0))){
                ingredients.add(line);
            }

            if (line.isEmpty()){
                Recipe recipe = new Recipe(name, cookingTime, ingredients);
                recipes.add(recipe);
                ingredients.clear();
            }

            if (lineFromFile.indexOf(line) == lastLine){
                Recipe recipe = new Recipe(name, cookingTime, ingredients);
                recipes.add(recipe);
            }
        }
    }

    public ArrayList<Recipe> getRecipesList(){
        return recipes;
    }

}
