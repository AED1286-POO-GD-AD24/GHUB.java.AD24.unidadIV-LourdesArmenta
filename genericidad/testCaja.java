package genericidad;

public class testCaja {
    public static void main(String[] args) {
        Caja<Integer> objCaja = new Caja<Integer>();
        objCaja.setContenido(5);
        System.out.println("El contenido de la caja es= "+objCaja.getContenido());

        Caja<String> objCaja2 = new Caja<String>();
        objCaja2.setContenido("cadena");
        System.out.println("El contenido de la caja es= "+objCaja2.getContenido());

        Caja<Persona> objCaja3 = new Caja<Persona>();
        Persona p1 = new Persona("Lourdes",57);
        objCaja3.setContenido(p1);
        System.out.println("El contenido de la caja es= "+objCaja3.getContenido());

   }
    
}
