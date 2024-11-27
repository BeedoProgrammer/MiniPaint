package Backend;

import java.awt.*;
import java.util.*;

public class Rectangle extends template {

    public Rectangle(Point position, Map<String, Double> properties) {
        super(position, properties);
    }
    
    @Override
    public void draw(Graphics canvas){
        if(this.getProperties() != null && this.getProperties().containsKey("length") && this.getProperties().containsKey("width")){
            int length = getProperties().get("length").intValue();
            int width = getProperties().get("width").intValue();
            canvas.setColor(getFillColor());
            canvas.fillRect(getPosition().x, getPosition().y, length, width);
            canvas.setColor(getColor());
            canvas.drawRect(getPosition().x, getPosition().y, length, width);
        }
    }
    
    @Override
    public String toString(){
        String str = super.toString();
        str = str + "," + String.valueOf(getProperties().get("length")) + "," + String.valueOf(getProperties().get("width"));
        return str;
    }
}