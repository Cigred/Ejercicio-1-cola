package Persona;

import java.util.Scanner;

public class Ccola {
static Scanner teclado=new Scanner(System.in);
    int max;
    private int FRENTE;
    private int FINAL;
    Persona[]COLA;
    Persona Pers=new Persona();
      
public Ccola(){
        this.max = 100;
        this.FRENTE = 0;
        this.FINAL = 0;
        this.COLA = new Persona[this.max +1];
         
}
public Ccola(int max){
        this.max = 100;
        this.FRENTE = 0;
        this.FINAL = 0;
        this.COLA = new Persona[this.max +1];
    for (int i = 0; i<this.max+1; i++ ){
            COLA[i] = new Persona();      
}
}
public boolean IsColallena(){
    if(this.FINAL == this.max){
        return true; 
    }else {
        return false ;
    }
}
public boolean IsColaVacia(){
  if(this.FRENTE == this.FINAL){
        return true; 
    }else {
        return false ;
    }   
}
   public void InsertarCola(){
   if(this.IsColallena()){
             System.out.println("La Pila esta Llena");
         }else{
            System.out.println("Ingrese Código : ");
            String codigo = teclado.next();
            Pers.setCodigo(codigo);
            System.out.println("Ingrese Nombre : ");
            String nombre = teclado.next();
            Pers.setNombre(nombre);
            System.out.println("Ingrese Tarifa : ");
            double tarifa = teclado.nextDouble();
            Pers.setTarifa(tarifa);
            System.out.println("Ingrese Hora de trabajo : " );
            int horas = teclado.nextInt();
            Pers.setHoras(horas);
            System.out.println(Pers.Cadena());
            this.FINAL++;
         }
       
     }
public void MostrarCola() {
        if (IsColaVacia()) {
            System.out.println("La Cola esta vacía");
        }
         else {
             System.out.println("\tElementos de la cola");
             System.out.println("\t======================");
             for(int i=FRENTE+1;i<=FINAL;i++){
                 System.out.println(Pers.Cadena());
            }  
         }
}

  public void EliminarCola(){
        if(this.FRENTE == this.FINAL){
System.out.println("La Cola esta vacia");      
        }else {
  for (int i = FRENTE +1; i<= FINAL; i++) {
      COLA[i] = COLA [i+1];
  }
  System.out.println("Elementos Eliminado.... "); 
FINAL--;
        }
  }
  
  public void VaciarCola(){
        FRENTE = 0;
        FINAL = 0;
 System.out.println("Elementos Eliminados....");
}
}
