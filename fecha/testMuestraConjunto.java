package fecha;

public class testMuestraConjunto {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Object arr[] ={ new Fecha(2,10,1970)
                       ,new FechaDetallada(23,12,1948)
                       ,new String("Esto es una cadena")
                       ,new Integer(34) };
                       
        MuestraConjunto.mostrar(arr);
        
    }
    
}
