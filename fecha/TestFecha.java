package fecha;

public class TestFecha {
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

        Fecha fecha2=new Fecha(5,11,2024);
        System.out.println(fecha2);

        Fecha fecha3=new Fecha("5/11/2024");
        if(fecha2 == fecha3 )
            System.out.println("Ambas fechas son iguales");
        else
           System.out.println("Ambas fechas No son iguales");


        if (fecha2.equals(fecha3))
            System.out.println("Ambas fechas son  iguales"); 
          
        else
            System.out.println("Ambas fechas No son iguales"); 
        
        String cadena1 = "ABCDE";
        String cadena2 = "ABCD";
        if (cadena1.equals(cadena2))
            System.out.println("Cadenas iguales");
        else
            System.out.println("Cadenas diferentes");

        

        Fecha fecha4 = new Fecha("32/1/2000");
        System.out.println(fecha4);

        Fecha fecha5 = new Fecha("29/2/2025");
        System.out.println(fecha5);

        //Fecha fecha6 = new Fecha("28/feb/2025");
        //System.out.println(fecha6);






        
    }
    
}
