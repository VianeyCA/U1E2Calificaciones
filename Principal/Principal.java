package Main;

import java.util.Scanner;
import Logica.Metodos;
public class Principal {
    
     public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
         String Nombre[]={"ACEVEDO CAMPOS ARIAGNA","AMBROCIO PEREZ MICHAEL HAZIEL","AMBROSIO HERNANDEZ VIANEY CELERINA",
             "CAMPOS CASASANERO JUAN PABLO","DIAZ DE JESUS MARIANA DAZZLING","DIAZ ROSAS ALEXIS EFREN",
             "DOMINGUEZ CAZALES JENNIFER IRLANDA","ELIGIO RAMOS MONSERRAT", "FLORES MALDONADO LILIANA",
             "GOMEZ ARAGON EDGAR OMAR", "GUTIERREZ VALLE SAMARA", "JUAREZ RAMOS ALEXIS MANUEL", 
             "LEYVA SILVA ROGELIO JESUS", "MARTINEZ DE LOS SANTOS ISABEL", "MARTINEZ RAYO IRIS MADAI"};
         int NoControl[]= {18680056,19680091,19680092,19680113,19680133,17680136,18680108,19680957,
         19680144,19680156,19680162,19680958,19680177,18680163,18680165};
         
         double Calificaciones[]= new double[Nombre.length];
         //Leer datos
         System.out.println("Bienvenido a el sistema de calificaciones");
         for(int i=0; i<Calificaciones.length; i++){
             do{
                 System.out.print("¿Cual es el promedio final de " +(i+1) + NoControl[i]+".- "+Nombre[i]+" ? ");
                 Calificaciones[i]=leer.nextDouble();  
             }while (Calificaciones[i]<0 || Calificaciones[i]>100);
             
         }
         Metodos metodo = new Metodos();
         int opc, opc2;
         do{
             opc2=1;
             System.out.println("---------------Menú---------------");
             System.out.println("1.- Promedio de clase: ");
             System.out.println("2.- Promedio de los primeros 5 alumnos ");
             System.out.println("3.- Promedios de los ultimos 5 alumnos");
             System.out.println("4.- Salir");
             
             opc=leer.nextInt();
             switch (opc){
                 case 1:
                     System.out.println("Promedio de clase "+ metodo.Promedio(Calificaciones));
                     break;
                 case 2: 
                     System.out.println("Promedio de los primeros 5 alumnos ");
                     metodo.Primeros(Nombre, NoControl, Calificaciones);
                     break;
                 case 3:
                     System.out.println("Promedio de los últimos 5 alumnos ");
                     metodo.Ultimos(Nombre, NoControl, Calificaciones);
                 case 4:
                     //System.out.println("Saliendo ");
                     //System.out.println();
                    break;       
             }
             if (opc != 4) {
                System.out.println("Desea continuar 1.-Sí 2.-No");
                opc2 = leer.nextInt();
            }if (opc==4){
             System.exit(0);
             }
        } while (opc2 != 2);       
     }
    
}
