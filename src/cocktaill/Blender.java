import java.util.ArrayList;

public class Blender {
    private ArrayList<Ingredient> ingredients;
    private int capacity;
    private int calories;
    private Color color;
    private int volume;

    public Blender(int capacity) {
        this.capacity = capacity;
        this.ingredients = new ArrayList<>();
        this.calories = 0;
        this.volume = 0;
        this.color = new Color(0, 0, 0); // Default color
    }

    public void add(Ingredient ingredient, Logger logger) {
        if (this.volume + ingredient.getVolume() > this.capacity) {
            logger.log("Adding ingredient failed: Blender overflow");
            throw new BlenderOverflowException();
        }
        this.ingredients.add(ingredient);
        this.volume += ingredient.getVolume();
        this.calories += ingredient.getCalories();
        this.color = blendColors(this.color, ingredient.getColor());
        logger.log("Added ingredient: " + ingredient.getInfo());
    }

    public Cocktail blend() throws BlenderOverflowException {
        if (this.ingredients.isEmpty()) {
            throw new BlenderEmptyException();
        }
        Cocktail cocktail = new Cocktail(this.calories, this.ingredients, this.color);
        this.ingredients.clear();
        this.volume = 0;
        this.calories = 0;
        this.color = new Color(0, 0, 0); // Reset to default color
        return cocktail;
    }

    public void pour(Cup cup) throws BlenderEmptyException {
        if (this.ingredients.isEmpty()) {
            throw new BlenderEmptyException();
        }
        if (cup.getCapacity() < this.volume) {
            throw new BlenderOverflowException();
        }
        cup.setCalories(this.calories);
        this.ingredients.clear();
        this.volume = 0;
        this.calories = 0;
        this.color = new Color(0, 0, 0); // Reset to default color
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
