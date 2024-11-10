package Backend;

import java.awt.*;
import java.util.*;

public class Draw implements DrawingEngine {
    private ArrayList<Shape> shapes;

    public Draw() {
        shapes = new ArrayList<>();
    }
    
    @Override
    public void addShape(Shape shape){
        shapes.add(shape);
    }
    @Override
    public void removeShape(Shape shape){
        shapes.remove(shape);
    }
    
    @Override
    public Shape[] getShapes(){
        return shapes.toArray(new Shape[0]);
    }
    
    @Override
    public void refresh(Graphics canvas){  
        for(Shape shape: shapes)
            shape.draw(canvas);
    }
}
