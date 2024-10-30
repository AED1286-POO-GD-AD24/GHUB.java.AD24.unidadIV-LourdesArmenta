package clasesAbstractas;

public class Carne extends Comida {
    private int grsGrasa;
    private boolean colesterol;
    private String zona;
    

    public int getGrsGrasa() {
        return grsGrasa;
    }

    public void setGrsGrasa(int grsGrasa) {
        this.grsGrasa = grsGrasa;
    }

    public boolean isColesterol() {
        return colesterol;
    }

    public void setColesterol(boolean colesterol) {
        this.colesterol = colesterol;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public void comer() {
        System.out.println("La carne no se come congelada");
    }

    @Override
    public void cocinar() {
        System.out.println("La carne se cocina");
        
    }

    @Override
    public void congelar() {
        System.out.println("La carne se congela");
        
    }

    public void cortar(){

    }

    public void empaniza(){

    }
    
    
    
}
