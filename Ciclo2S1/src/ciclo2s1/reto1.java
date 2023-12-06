package ciclo2s1;

public class reto1 {
    
    //CREAMOS LA FUNCION Y ES LO UNICO QUE DEBO COPIAR Y PEGAR EN CODERUNNER
    //AQUI DEBE IR LA LOGICA DEL CALCULO DEL ALMACENAMIENTO
    float calcularCostoAlmacenamiento(boolean refigerado, float valorBase){
        
        float precioAlmacenamiento = 0;
        
        if (refigerado == true) {
            precioAlmacenamiento = valorBase * 30 / 100;
            precioAlmacenamiento = valorBase + precioAlmacenamiento;
        } else {
            precioAlmacenamiento = valorBase * 15 / 100;
            precioAlmacenamiento = valorBase + precioAlmacenamiento;
        }
        
        return precioAlmacenamiento;
    }
    
    //REVISION DE LO APRENDIDO PUNTO 5
    private static double salario(int cantidadHoras){
        
        double salarioDevengado = 0; //double salario=cantidadHoras
        //AQUI DEBE IR LA LOGICA DEL CALCULO DEL SALARIO
        
        return salarioDevengado;
    }
    
    public static void main(String[] args) {
        System.out.println(salario(10));
    }
}
