package clasesAbstractas;

public abstract class Comida {
    private double precio;
    private double calorias;
    private double peso;
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getCalorias() {
        return calorias;
    }
    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract void comer();
    public abstract void congelar();
    public abstract void cocinar();
    
    

    
    
}
