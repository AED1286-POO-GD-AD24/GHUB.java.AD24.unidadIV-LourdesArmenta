package genericidad;

public class Terna <T>{
    private T p1;
    private T p2;
    private T p3;
    //private T dato;//Error no se puede instancia un objeto tipo T
    
    public Terna(){
        
        this(null,null,null);
        //dato = new T();  //Error no se puede instancia un objeto tipo T
    }
    public Terna(T p1, T p2, T p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public T  get(int i) throws Exception{
        if(! (i>=1 && i<=3))
            throw new Exception("Elemento no existe");
        if (i==1 ) return p1;
        else if (i==2) return p2;
        else return p3;

    }

    public void set(T valor, int i) throws Exception{
        if (!(i>=1 && i<=3))
            throw new Exception("Violacion de la terna");
        if (i==1) p1 = valor;
        else if(i==2) p2 = valor;
        else if(i==3) p3 = valor;
    }

    @Override
    public String toString() {
        return "Terna "+p1+", "+p2+", "+p3;
    }

    public T[] copiarDatos(T[] v){//ESTO ES POSIBLE
        if (v.length < 3) {
            throw new IllegalArgumentException(
            "El array proporcionado debe tener al menos 3 elementos.");
        }
        v[0] = p1;
        v[1] = p2;
        v[2] = p3;
        return v;

    }
    

    
}
