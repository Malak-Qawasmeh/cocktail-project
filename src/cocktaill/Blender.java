package cocktaill;

import cocktaill.Ingredient;
import cocktaill.MyLogger;
import java.util.ArrayList;
import cocktaill.BlenderOverflowException;
import cocktaill.BlenderEmptyException;
import java.awt.Color;

public class Blender {

    private ArrayList<Ingredient> ingredients;
    private int capacity;
    private int calories;
    private Color color;
    private int volume;
    private MyLogger logger;
    private Color blendedColor;

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

public int getTotalVolume() {
        int totalValue = 0;
        for (Ingredient ingredient : ingredients) {
            totalValue += ingredient.getVolume();
        }
        return totalValue;
    }
    public void add(Ingredient ingredient) throws BlenderOverflowException {
        if (this.volume + getTotalVolume() < this.capacity) {
            this.ingredients.add(ingredient);           
            this.calories += ingredient.getCalories();
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

    }

    public Cocktaill blend() {
        int totalVolume = this.getTotalVolume();               
                               
        float r = 0, g = 0, b = 0;
        int count = ingredients.size();

        for (Ingredient ingredient : ingredients) {
            r += ingredient.getColor().getRed();
            g += ingredient.getColor().getGreen();
            b += ingredient.getColor().getBlue();
        }

        // Average the colors
        r /= count;
        g /= count;
        b /= count;

        Color blendedColor = new Color((int) r, (int) g, (int) b);                          
        Cocktaill cocktail = new Cocktaill(blendedColor, calories,totalVolume);
        return cocktail;

    }

    public String getInfo() {
        return "Blender[capacity=" + capacity + ", calories=" + calories + ", volume=" + volume + ", color=" + color + "]";
    }
}
