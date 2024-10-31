package clasesAbstractas;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        
        return base*altura/2;
    }

    @Override
    public void dibular() {
        System.out.println("Dibujar un triangulo");
        
    }
    
    
}
