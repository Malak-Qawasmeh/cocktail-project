
package cocktaill;


public class Cup {
  
private int capacity;
private int calories;

public Cup (int capacity , int calories){
    this.capacity = capacity;
    this.calories = calories;
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

    public String getInfo(){ 
        return "capacity = " + capacity + ", calories = " + calories;
    }

}
