
package ciclo2s1.cuestionarioa1;

public class Ciclo2s1CuestionarioA1 {

    //CREO LA FUNCION SALARIO
    //ESTO ES LO QUE COPIO Y PEGO CON CODE RUNNER
    public static double salario (int cantidadHoras){
        
        double salarioDevengado = 0;
        
        int smlv = 1000000;
        
         if (cantidadHoras <= 40) {
            
             salarioDevengado = cantidadHoras*(smlv*0.015);
             
        } else {
        
             salarioDevengado = cantidadHoras*(smlv * 0.02);
             
        }
        
        return salarioDevengado;
    }
    
    
    //METODO JAVA PARA EJECUTAR LA APLICACIÓN
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Su salario semanal es: "+salario(10));
    }
    
}
