package interfases;

public class Gato implements Animal{

    @Override
    public void hacerSonido() {
        System.out.println("miau miau ");
        
    }

    @Override
    public void mover() {
        System.out.println("el gato corre");
        
    }
    
    
}
