package variablesInstancia;

import fecha.FechaDetallada;

public class TestPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan"
                                 ,"21779235"
                                 ,new FechaDetallada(23,3,1971));

        Persona p2 = new Persona("Pablo"
                                 ,"19712321"
                                 ,new FechaDetallada(12,6,1968));

        System.out.println(p1);
        System.out.println(p1);
        System.out.println(p1);
        System.out.println("---");
        System.out.println(p2);
        System.out.println(p2);
        System.out.println("---");
        System.out.println(p1);
        System.out.println(p1);
       


    }
    
}
