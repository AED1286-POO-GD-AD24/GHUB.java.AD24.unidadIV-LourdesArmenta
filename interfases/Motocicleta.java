package interfases;

public class Motocicleta extends VehiculoAbstracto{
    private int posicionConduccion;

    public Motocicleta(String matricula){
        super(matricula);
        
    }
    
    @Override
    public void conducir() {
        System.out.println("Estoy conduciendo una motocicleta");
        
    }

    public int getPosicionConduccion() {
        return posicionConduccion;
    }


    public void setposicionConduccion(int posicionConduccion) {
        this.posicionConduccion = posicionConduccion;
    }

    
    
}
