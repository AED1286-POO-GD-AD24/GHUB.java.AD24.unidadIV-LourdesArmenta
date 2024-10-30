package animales;

public class Rana extends Anfibio{
    private boolean esVenenoza;
    public Rana(){
        super("Rana Desconocida", 0, false);
        this.esVenenoza = false;
    }

    
    public Rana(String nombre, int edad, boolean cola, boolean esVenenoza) {
        super(nombre, edad, cola);
        this.esVenenoza = esVenenoza;
    }


    public boolean isEsVenenoza() {
        return esVenenoza;
    }


    public void setEsVenenoza(boolean esVenenoza) {
        this.esVenenoza = esVenenoza;
    }


    @Override
    public void mostrarInfo() {
        
        super.mostrarInfo();
        System.out.println("Es Venenoza: "+esVenenoza);

    }

    
    
    


    
}
