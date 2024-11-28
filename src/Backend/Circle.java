package Backend;

import java.awt.*;
import java.util.*;

public class Circle extends template {

    public Circle(Point position, Map<String, Double> properties) {
        super(position, properties);
    }
    
    @Override
    public void draw(Graphics canvas){
        if(this.getProperties() != null && this.getProperties().containsKey("radius")){
            int radius = getProperties().get("radius").intValue();
            canvas.setColor(getFillColor());
            canvas.fillOval(getPosition().x, getPosition().y, radius, radius);
            canvas.setColor(getColor());
            canvas.drawOval(getPosition().x, getPosition().y, radius, radius);
        }
    }
    
    @Override
    public String toString(){
        String str = super.toString();
        str = str + ", " + String.valueOf(getProperties().get("radius"));
        return str;
    }
}