package genericidad;

import java.io.UncheckedIOException;

public class testTerna {
    public static void main(String[] args) throws Exception {
        Terna<Double> terna = 
                    new Terna<Double>(2.5,3.8,9.9);
        System.out.println(terna);
        terna.set(10.5,1);
        System.out.println(terna);
        terna.set(100.5,3);
        //terna.set(100.5,0); /// se lanza una exception
        System.out.println(terna);
        System.out.println(terna.get(1));
        System.out.println(terna.get(2));
        System.out.println(terna.get(3));
        //System.out.println(terna.get(4)); // se lanza una exception

        Terna<Persona> terna1 = new Terna<Persona>();
        System.out.println("Persona 1:"+terna1.get(1));
        System.out.println("Persona 2:"+terna1.get(2));
        System.out.println("Persona 3:"+terna1.get(3));
        terna1.set(new Persona("Juan",20),1);
        terna1.set(new Persona("Pedro",20),2);
        terna1.set(new Persona("Julia",5),3);
        System.out.println("Persona 1:"+terna1.get(1));
        System.out.println("Persona 2:"+terna1.get(2));
        System.out.println("Persona 3:"+terna1.get(3));

        Terna<Character> terna3 = new Terna<>();

        Terna<Integer> terna4 = new Terna<>();
        Integer arreglo[] = {5,6,7};
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        Integer arreglo2[]= new Integer[3];
        arreglo2 = terna4.copiarDatos(arreglo);
        System.out.println(arreglo2[0]);
        System.out.println(arreglo2[1]);
        System.out.println(arreglo2[2]);



        //Terna<int> terna4 = Terna<int>(); //Error rompe la primera restriccion
        //T[] matriz = new T[10]; //Error no se pueden crear arreglos de tipo generico



        @SuppressWarnings("unchecked")
        Terna<String>[] lista = (Terna<String>[]) new Terna[20];



        


  



        
    }
    
}
