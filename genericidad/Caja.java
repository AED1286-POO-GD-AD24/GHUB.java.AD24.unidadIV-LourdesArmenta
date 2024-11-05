package genericidad;
/*
 * Ejemplo de una clase genérica
 * Sintaxis
 * class NombreClase <nombre_tipo> {......}
 */

public class Caja <T> {
    private T contenido;

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }
    


}
