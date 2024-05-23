
package cocktaill;

import java.awt.Color;


public class Ice extends Ingredient {
    
       private Color color;
        private int volume; 
        
 public Ice (String name , int calories, int volume, Color color ){
     super(name, calories);
     this.color = color;
     this.volume = volume;
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
        return super.getInfo() + ", Color: " + color+"\n " + "volume: " + volume;
    }
}
