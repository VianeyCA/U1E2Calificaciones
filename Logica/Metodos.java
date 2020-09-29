package Logica;

public class Metodos {
    public double Promedio(double[] calif){
        double aux=0;
        for (int i=0; i<calif.length;i++){
            aux= aux+calif[i];
        }
        aux=aux/calif.length;
        return aux;
    }
    
         public void Primeros(String[] Nombre, int[] NoControl, double[] Calif) {
         double aux = 0;
         for (int i = 0; i < 5; i++) {
             System.out.print((i + 1) + NoControl[i] +".-"+ Nombre[i] + " Final: " + Calif[i]);
             aux = aux + Calif[i];
             System.out.println("");
         }
         aux = aux / 5;
         System.out.println("Calificaciones de los primeros alumnos: " + aux);
    }

         public void Ultimos(String[] Nombre, int[] NoControl, double[] Calif) {
         double aux = 0;
         for (int i = Calif.length - 1; i > 10; i--) {
            System.out.print((i + 1) + NoControl[i]+ ".-"+Nombre[i] + "Final: " + Calif[i]);
            aux = aux + Calif[i];
            System.out.println("");
         }
         aux = aux / 5;
         System.out.println("Calificacion de los ultimos alumnos: " + aux);
    }
    
    
}
