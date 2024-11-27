package Backend;

import java.awt.*;
import java.util.*;

public class Line extends template {

    public Line(Point position, Map<String, Double> properties) {
        super(position, properties);
    }
    
    @Override
    public void draw(Graphics canvas){
        if(this.getProperties() != null && this.getProperties().containsKey("x2") && this.getProperties().containsKey("y2")){
            canvas.setColor(getColor());
            canvas.drawLine(getPosition().x, getPosition().y, getProperties().get("x2").intValue(), getProperties().get("y2").intValue()); 
        }
    }
    
    @Override
    public String toString(){
        String str = super.toString();
        str = str + "," + String.valueOf(getProperties().get("x2")) + "," + String.valueOf(getProperties().get("y2"));
        return str;
    }
}