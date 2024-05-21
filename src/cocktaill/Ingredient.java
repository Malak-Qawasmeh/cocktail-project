
package cocktaill;


public class Ingredient {
    private String name;  
    private int calories; 
 
public Ingredient(String name, int calories) {
    this.name = name;  
    this.calories = calories;
} 
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    
    public String getInfo() {
        return "Name: " + name + ", Calories: " + calories;
    }
    
  
}