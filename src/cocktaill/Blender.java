
package cocktaill;


class Blender {
  //  Ingredient ArrayList<Ingredient>;
    private int capacity;
    private int calories;
    private int volume;
    private Color color;

    public Blender(int capacity, int calories, int volume, Color color) {
        this.capacity = capacity;
        this.calories = calories;
        this.volume = volume;
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
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
    

    public String getInfo() {
        return "volume = " + volume + ", capacity = " + capacity;
    }

 public void addIngredient(int volume, int ingredientVolume) throws BlenderOverloadException {
        if (volume + ingredientVolume > capacity) {
            throw new BlenderOverloadException("Blender capacity exceeded");
        }
        int name;
        name = volume + ingredientVolume;
    }
}

    
    
    
