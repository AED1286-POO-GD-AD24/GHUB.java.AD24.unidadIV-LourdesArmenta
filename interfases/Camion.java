package interfases;

public class Camion extends VehiculoAbstracto{
    int tam_remolque;
    public Camion(String matricula){
        super(matricula);
    }
    

    @Override
    public void conducir() {
        System.out.println("Estoy conduciendo un camion");
        
    }


    public int getTam_remolque() {
        return tam_remolque;
    }


    public void setTam_remolque(int tam_remolque) {
        this.tam_remolque = tam_remolque;
    }

    
    
}
