package clasesAbstractas;

public class Tuberculo extends Comida{
    private int grsFibra;
    private boolean temporada;
    private String zona;
    

    public int getGrsFibra() {
        return grsFibra;
    }

    public void setGrsFibra(int grsFibra) {
        this.grsFibra = grsFibra;
    }

    public boolean isTemporada() {
        return temporada;
    }

    public void setTemporada(boolean temporada) {
        this.temporada = temporada;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void pelar(){
        System.out.println("El tuberculo se puede pelar");
    }

    public void cortar(){
        
    }

    @Override
    public void comer() {
        System.out.println("Los tuberculos se pelan antes de comer");
        
    }

    @Override
    public void cocinar() {
        System.out.println("el tuberculo se cocina");
        
    }

    @Override
    public void congelar() {
        System.out.println("el tuberculo se congela");
        
    }
    
    
    
}
