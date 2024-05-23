

package cocktaill;

import java.awt.Color;

public class Fruit extends Ingredient {
        private int volume;
        private Color color;
        
    public Fruit(String name, int calories, int volume, Color color) {
        super(name, calories);
        this.volume = volume;
        this.color = color;
    }

        @Override
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

        @Override
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

   

    @Override
    public String getInfo() {
        return super.getInfo() +
                ", Volume: " + volume + 
                ", Color: " + color;
    }

    
}
