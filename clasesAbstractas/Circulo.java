package clasesAbstractas;

public class Circulo extends Figura {
    private double xc,xy;//coordenadas del centro
    private double radio;
    

    public double getXc() {
        return xc;
    }

    public void setXc(double xc) {
        this.xc = xc;
    }

    public double getXy() {
        return xy;
    }

    public void setXy(double xy) {
        this.xy = xy;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return (Math.PI*radio*radio);
       
    }

    @Override
    public void dibular() {
        System.out.println("Dibujar un circulo");
        
    }
    
    
}
