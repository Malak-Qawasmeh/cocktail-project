package cocktaill;

import cocktaill.Color;
import cocktaill.Ingredient;
import cocktaill.MyLogger;
import java.util.ArrayList;
import cocktaill.BlenderOverflowException;
import cocktaill.BlenderEmptyException;

public class Blender {

    private ArrayList<Ingredient> ingredients;
    private int capacity;
    private int calories;
    private Color color;
    private int volume;
    private MyLogger logger;

    public Blender(int capacity, MyLogger logger) {
        this.capacity = capacity;
        this.logger = logger;
        this.ingredients = new ArrayList<>();
    }

    public Blender(ArrayList<Ingredient> ingredients, int capacity, int calories, Color color, int volume, MyLogger logger) {
        this.ingredients = ingredients;
        this.capacity = capacity;
        this.calories = calories;
        this.color = color;
        this.volume = volume;
        this.logger = logger;
    }

    private int getTotalVolume() {
        int totalVolume = 0;
        for (Ingredient ingredient : ingredients) {
            if (ingredient instanceof Fruit) {
                totalVolume += ((Fruit) ingredient).getVolume();
            } else if (ingredient instanceof Milk) {
                totalVolume += ((Milk) ingredient).getVolume();
            }
        }
        return totalVolume;
    }

    public void add(Ingredient ingredient) throws BlenderOverflowException {
        if (this.volume + this.getVolume(ingredient) < this.capacity) {
            this.ingredients.add(ingredient);
            this.volume += getTotalVolume();
            this.calories += ingredient.getCalories();
            this.color = blendColors(this.color, ingredient.getColor());
 
        } else {
            throw new BlenderOverflowException();
        }
               logger.log("Added ingredient: " + ingredient.getInfo());
    }
    
     public void pour(Cup cup) throws BlenderEmptyException {
        if (this.ingredients.isEmpty()) {
            throw new BlenderEmptyException();        
        }
        cup.setCalories(this.calories);
        this.ingredients.clear();
        this.volume = 0;
        this.calories = 0;
        this.color = new Color(0, 0, 0); // Reset to default color
    
       }
     
    public Cocktaill blend() throws BlenderEmptyException {
        if (this.ingredients.isEmpty()) {
            throw new BlenderEmptyException();
        }
        Cocktaill cocktail = new Cocktaill(color, calories, ingredients);
        this.ingredients.clear();
        this.volume = 0;
        this.calories = 0;
        this.color = new Color(0, 0, 0); // Reset to default color
        return cocktail;
    }

   

    public int getVolume(Ingredient ingredient) {
        if (ingredient instanceof Fruit) {
            return ((Fruit) ingredient).getVolume();
        } else if (ingredient instanceof Milk) {
            return ((Milk) ingredient).getVolume();
        }

        return 0;
    }

    public String getInfo() {
        return "Blender[capacity=" + capacity + ", calories=" + calories + ", volume=" + volume + ", color=" + color + "]";
    }

    private Color blendColors(Color c1, Color c2) {
        int r = (c1.getR() + c2.getR()) / 2;
        int g = (c1.getG() + c2.getG()) / 2;
        int b = (c1.getB() + c2.getB()) / 2;
        return new Color(r, g, b);
    }
}
