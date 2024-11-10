package Backend;

import java.awt.*;
import java.util.*;

public class Square extends template {

    public Square(Point position, Map<String, Double> properties) {
        super(position, properties);
    }
    
    @Override
    public void draw(Graphics canvas){
        if(this.getProperties() != null && this.getProperties().containsKey("length")){
            int length = getProperties().get("length").intValue();
            canvas.setColor(getColor());
            canvas.drawRect(getPosition().x, getPosition().y, length, length);
            canvas.setColor(getFillColor());
            canvas.fillRect(getPosition().x + 1, getPosition().y + 1, length - 1, length - 1);
        }    
    }
}
