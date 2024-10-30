package miPrincipal;
import animales.*;
import clasesAbstractas.*;

public class Principal {
    

    public static void main(String[] args) {
        /* 
        Animal listaAnimales[]={ new Animal("Perro",3),
                                 new Anfibio("Lagarto",2,true),
                                 new Mamifero("gato",1,4),
                                 new Rana("rana de la selva",2,false,true) 
                               };
        
        String listaString[] ={"juan","pedro","luis"};

        System.out.println(listaAnimales[0].getNombre());
        System.out.println(listaAnimales[0].getEdad());
        System.out.println(listaAnimales[0].hacerSonido());
        listaAnimales[0].mostrarInfo();

        System.out.println();
        System.out.println(listaAnimales[1].getNombre());
        System.out.println(listaAnimales[1].getEdad());
        System.out.println(listaAnimales[1].hacerSonido());
        listaAnimales[1].mostrarInfo();

        System.out.println();
        System.out.println(listaAnimales[2].getNombre());
        System.out.println(listaAnimales[2].getEdad());
        System.out.println(listaAnimales[2].hacerSonido());
        listaAnimales[2].mostrarInfo();

        System.out.println();
        System.out.println(listaAnimales[3].getNombre());
        System.out.println(listaAnimales[3].getEdad());
        System.out.println(listaAnimales[3].hacerSonido());
        listaAnimales[3].mostrarInfo();

        */

        //Localidad localidad = new Localidad(); //no sepuede instanciar una clase abstracta
        Ciudad ciudad = new Ciudad();
        ciudad.setNombre("Los Mochis");
        ciudad.setHabitantes(350000);
        System.out.println(ciudad.getNombre());
        System.out.println(ciudad.getHabitantes());
        


        




        
    }
}