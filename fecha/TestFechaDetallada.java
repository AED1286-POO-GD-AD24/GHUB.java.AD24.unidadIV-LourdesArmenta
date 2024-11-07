package fecha;

public class TestFechaDetallada {
    public static void main(String[] args) {
        FechaDetallada f = new FechaDetallada();
        f.setDia(25);
        f.setMes(10);
        f.setAnio(2024);
        System.out.println(f);

        FechaDetallada f1 = new FechaDetallada(11,2,1968);
        System.out.println(f1);

        FechaDetallada f2 = new FechaDetallada("11/2/1968");
        System.out.println(f2);



    }
    
}
