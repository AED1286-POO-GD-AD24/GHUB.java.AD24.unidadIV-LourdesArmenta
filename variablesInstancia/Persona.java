package variablesInstancia;
import fecha.Fecha;


public class Persona {
    private String nombre; //atributo
    private String dni; //atributo
    private Fecha fechaNacimiento; //atributo

    private  int cont = 0; //variable de instancia

    public Persona(String nombre, String dni, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        cont++;
        return nombre +", DNI: "+dni 
                      +", nacido el: "+fechaNacimiento
                      +" ("+cont+")";
    }
    
    



}
