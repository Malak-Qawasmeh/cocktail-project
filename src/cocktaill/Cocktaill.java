
package cocktaill;

import cocktaill.Ingredient;
import java.awt.Color;
import java.util.ArrayList;

    public class Cocktaill {
    private Color color;
    private int calories ;
    private int volume;


    public Cocktaill() {
    }

public Cocktaill(Color color ,int calories,int volume){
   this.color = color;
   this.calories = calories;
   this.volume = volume;
}

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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
        return "Cocktail info: " + "\n"
                + "Calories: " + this.calories + ".cal" + "\n"
                + "Volume: " + this.volume + "ml\n";
               
    }
}


