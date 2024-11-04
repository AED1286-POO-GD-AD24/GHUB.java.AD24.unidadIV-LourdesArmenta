package fecha;

public class testFecha {
    public static void main(String[] args) {
        Fecha f = new Fecha();
        f.setDia(2);
        f.setMes(10);
        f.setAnio(1968);

        //Imprimimos el dia
        System.out.println("Dia = "+f.getDia());
        //Imprimimos el mes
        System.out.println("Mes = "+f.getMes());
        //imprimimos el año
        System.out.println("Año = "+f.getAnio());

        //imprimimos la fecha
        System.out.println(f);




        
    }
    
}
