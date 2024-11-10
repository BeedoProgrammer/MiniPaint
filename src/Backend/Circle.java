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
            canvas.setColor(getColor());
            canvas.drawOval(getPosition().x, getPosition().y, radius, radius);
            canvas.setColor(getFillColor());
            canvas.fillOval(getPosition().x + 1, getPosition().y + 1, radius - 1, radius - 1);
        }
    }
}