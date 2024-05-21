
package cocktaill;

import cocktaill.Ingredient;
import java.util.ArrayList;

    public class Cocktaill {
    private Color color;
    private int calories ;
    private ArrayList<Ingredient> ingredients;

public Cocktaill(Color color ,int calories, ArrayList<Ingredient> ingredients){
   this.color = color;
   this.calories = calories;
   this.ingredients = ingredients;
}

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    
    public String getInfo() {
        return "Cocktail[calories=" + calories + ", ingredients=" + ingredients + ", color=" + color + "]";
    }
}


