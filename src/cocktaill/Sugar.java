
package cocktaill;

public class Sugar extends Ingredient {
    private Color color;
        
        
 public Sugar (String name , int calories){
     super(name, calories);
     this.color = color;
 }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
 
 @Override
    public String getInfo() {
        return super.getInfo() + ", Color: " + color;
    }
}
