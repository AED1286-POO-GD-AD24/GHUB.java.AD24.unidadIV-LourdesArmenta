package clasesAbstractas;

import java.awt.Color;

public abstract class Figura {
    private Color color;
    
    public abstract double calcularArea();
    public abstract void dibular();
    public Figura(){
        color = Color.BLUE;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    
    
}
