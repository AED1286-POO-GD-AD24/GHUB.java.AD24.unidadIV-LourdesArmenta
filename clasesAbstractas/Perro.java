package clasesAbstractas;

public class Perro extends Animal {
    public Perro(String nombre){
        super(nombre);// llama al constructor de la clase abstracta
    }

    @Override
    public void hacerSonido() {
        System.out.println("gua gua");
        
    }
    
    
}
