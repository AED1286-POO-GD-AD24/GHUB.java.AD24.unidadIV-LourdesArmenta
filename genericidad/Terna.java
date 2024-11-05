package genericidad;

public class Terna <T>{
    private T p1;
    private T p2;
    private T p3;
    public Terna(){
        
        this(null,null,null);
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
    

    
}
