package interfases;

public class Coche extends VehiculoAbstracto{
    String tipo;

    public Coche(String matricula){
        super(matricula);
    }
    

    @Override
    public void conducir() {
       System.out.println("Estoy conduciendo un Coche");
        
    }


    public String getTipo() {
        return tipo;
    }



    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
}
