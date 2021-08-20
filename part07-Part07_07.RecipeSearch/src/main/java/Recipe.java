import java.util.ArrayList;

public class Recipe {

    String name;
    int cookingTime;
    ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredients){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return name + ", cooking time: " + cookingTime;
    }
}
