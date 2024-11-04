package interfases;

public class ClienteMain {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.hacerSonido();
        perro.mover();
        perro.jugar();

        Gato gato = new Gato();
        gato.hacerSonido();
        gato.mover();
        

    }

}
