
package Persona;

import java.util.Scanner;

public class AplicaCola {
 public static Ccola Cola;
 static Scanner teclado = new Scanner(System.in);
public static void main (String [] args )   {
    MenuCola();
}
static void creaCola() {
    int tam;
    System.out.print("Ingrese tamaño de la Cola :");
    tam = teclado.nextInt();
    Cola = new Ccola(tam);
    System.out.println("pila creada .... \n");
}
public static void MenuCola() {
    int opcion;
    do{     System.out.println("\n=====================");
            System.out.println("\n Menu de Opciones");  
            System.out.println("[1] Crea Cola"); 
            System.out.println("======================");
            System.out.println("[2] Ingresar Datos ");
            System.out.println("[3] Mostrar Datos ");
            System.out.println("[4] Eliminar Datos");
            System.out.println("[5] Vaciar Cola");
            System.out.println("=======================");        
            System.out.println("0<- Salir");    
  System.out.print("\nIngrese una alternativa: ");
            opcion = teclado.nextInt();
            System.out.println();
            
            switch (opcion) {
                 case 1: 
                    creaCola();
                    break;
                case 2: 
                    Cola.InsertarCola();
                    break;
                case 3: 
                    Cola.MostrarCola();
                    break;    
                case 4: 
                    Cola.EliminarCola();
                    break;
                case 5: 
                    Cola.VaciarCola();
                    System.out.println("\n");
                    break; 
                case 0:
                System.out.println("Saliendo del Sistema.....");
                 System.exit(0);
                break;
                
                default:
                 System.out.println("Ingrese Opcion Correcta.....");
                 System.out.println("\n");
            }
        }while (opcion!=0);
    
    
        }
}
           
