package interfases;

public class Perro implements Mascota{

    @Override
    public void hacerSonido() {
        System.err.println("gua gua ");
        
    }

    @Override
    public void mover() {
        System.out.println("El perro corre");
        
    }

    @Override
    public void jugar() {
        System.out.println("El perro juega");
        
    }
    
    
    
}
