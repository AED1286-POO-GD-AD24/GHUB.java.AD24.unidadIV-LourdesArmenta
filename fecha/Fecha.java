package fecha;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(){

    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha(String cadena){
        //buscamos la primera ocurrencia de '/'
        int pos1=cadena.indexOf('/');

        //buscamos la ultima ocurrencia de '/'
        int pos2 = cadena.lastIndexOf('/');

        //procesamos el dia
        String sDia = cadena.substring(0, pos1);
        dia =Integer.parseInt(sDia);

        //procesmos del mes
        String sMes = cadena.substring(pos1+1,pos2);
        mes = Integer.parseInt(sMes);

        //procesamos el año
        String sAnio = cadena.substring(pos2+1);
        anio = Integer.parseInt(sAnio);

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
       
        return dia+"/"+mes+"/"+anio;
    }

    @Override
    public boolean equals(Object obj) {
        //convertir el objeto obj de tipo Object a un objeto fecha
        Fecha otra = (Fecha) obj;
        if((this.dia == otra.dia ) &&(this.mes == otra.mes) && (this.anio == otra.anio))
           return true;
        else
           return false;
           

        
    }

    

    
    
    

}
