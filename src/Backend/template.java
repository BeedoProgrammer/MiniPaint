package Backend;

import java.awt.*;
import java.util.*;

public abstract class template implements Shape {
    private Point position;
    private Color color;
    private Color fillColor;
    private Map<String, Double> properties;

    public template(Point position, Map<String, Double> properties) {
        this.position = position;
        this.color = Color.BLACK;
        this.fillColor = Color.WHITE;
        this.properties = properties;
    }

    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
    }

    @Override
    public Map<String, Double> getProperties() {
        return properties;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }
    
    @Override
    public void setFillColor(Color color){
        this.fillColor = color;
    }
            
    @Override
    public Color getFillColor(){
        return fillColor;
    }
    
    @Override
    public void draw(Graphics canvas){
        
    }
    
    @Override
    public String toString(){
        String str = "\n" + String.valueOf(getFillColor()) + ", " + String.valueOf(getColor()) + ", " + String.valueOf(getPosition().x) + ", " + String.valueOf(getPosition().y);
        return str;
    }
}
