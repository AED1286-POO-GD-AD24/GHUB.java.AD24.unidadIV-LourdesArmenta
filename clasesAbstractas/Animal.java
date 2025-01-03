package clasesAbstractas;
/*
 * Ejemplo de constructores en clase abstractas
 */

public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();
    public final void dormir(){
        System.out.println(nombre+" esta durmiendo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
