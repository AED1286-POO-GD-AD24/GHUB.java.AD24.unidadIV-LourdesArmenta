package fecha;

public class testPolimorfismo {
    public static void main(String[] args) {
        Fecha fec = new FechaDetallada("25/02/1968");

        Object obj = new FechaDetallada(3,12,2008);

        //imprimimos los abjetos
        System.out.println("fec ="+fec); //invoca al toStrin de fec
        System.out.println("obj = "+ obj); //incova al toString de obj
    }
    
}
