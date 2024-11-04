package interfases;

public abstract class VehiculoAbstracto implements Vehiculo{
    private String matricula;

    public VehiculoAbstracto(String matricula){
        this.matricula = matricula;

    }
    public String getMatricula() {
        return matricula;
    }
    @Override
    public void apagarMotor() {
        System.out.println("Motor apagado de vehiculo con matricula: "+matricula);
        
    }
    
    public abstract void conducir();
      
    
    @Override
    public void encenderMotor() {
        System.out.println("Motor encendido de vehículo con matricula: "+matricula);
        
        
    }
    
    


}
