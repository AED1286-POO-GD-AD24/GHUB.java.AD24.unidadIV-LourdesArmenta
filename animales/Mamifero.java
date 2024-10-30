package animales;
public class Mamifero extends Animal{
    private int numeroPatas;

    public Mamifero(){
        super("Mamífero Desconocido", 0);
        this.numeroPatas = 4;

    }
    public Mamifero(String nombre, int edad, int numeroPatas) {
        super(nombre, edad);
        this.numeroPatas = numeroPatas;
    }
    public int getNumeroPatas() {
        return numeroPatas;
    }
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    @Override
    public void mostrarInfo() {
        
        super.mostrarInfo();
        System.out.println("Numero de Patas: "+numeroPatas);

    }
    
    
    
    
}