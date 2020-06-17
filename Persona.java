package Persona;


public class Persona {
private String codigo,nombre;
private int horas;
private double  tarifa;
public Persona(){
    
}
public void registrar (String cod, String nom, int hora, double tari) {
    this.nombre = nom;
    this.codigo = cod;
    this.horas = hora;
    this.tarifa = tari;
}  

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    public double hallarSueldo(){
        double suel;
        suel =(tarifa*horas);
        return suel;
    }
   public void mostrarSueldo(){
       System.out.println("Sueldo" + hallarSueldo());
   }
    public String Cadena(){
        return("\ncodigo :"+ codigo + 
               "\nnombre :"+ nombre + 
               "\nTarifa:"+ tarifa+
               "\nHoras :"+ horas+
               "\nSueldo : "+ hallarSueldo());
    }       

}
