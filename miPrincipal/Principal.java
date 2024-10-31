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

        //utilizar la clase abstracta
        Tarifa [] prt = new Tarifa[100];
        //crear aleatoriamente objetos de las subclases correspondientes
        for(int i=0;i<100;i++){
            if(i%5==0)
               prt[i]= new GranClase();
            else if(i%3 == 0)
               prt[i]= new Preferente();
            else
               prt[i]= new Turista();

        }
        for(int i=0;i<100;i++){
            prt[i].calcularCosto();
        }

        Triangulo t1 = new Triangulo();
        t1.setAltura(4);
        t1.setBase(2);
        System.out.println(t1.calcularArea());
        t1.calcularArea();
        Circulo c1 = new Circulo();
        c1.setRadio(5);
        System.out.println(c1.calcularArea());
        c1.dibular();

        


        




        
    }
}