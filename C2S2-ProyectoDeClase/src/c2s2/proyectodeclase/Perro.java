
package c2s2.proyectodeclase;

public class Perro {
    //1. DEFINIR LOS ATRIBUTOS
    // 13 min 1:02:00
    private String raza;
    private String color;
    private String tamano;
    private int edad;
    
    //2. CONSTRUCTOR
    Perro (String parametroRaza, String parametroColor, String parametroTamano, int parametroEdad){
        //2.1 INICIALIZACION DE ATRIBUTOS DESDE EL CONSTRUCTOR
        this.raza = parametroRaza;
        this.color = parametroColor;
        this.tamano = parametroTamano;
        this.edad = parametroEdad;
    }
    
    Perro (String parametroRaza, String parametroTamano){
    
    }
    
    Perro (){
    
    }
    
    //3. METODOS --> ACCIONES DE LA CLASE
    
    void comer(){
        
    }
    void dormir(){
    
    }
    void sentar(){
    
    }
    void correr(){
        System.out.println("Ejecuté un método, ¡Qué bien!");
    }
    void registrar(){
        System.out.println("La mascota ha sido registrada con los siguientes datos: \n" + "Raza: " + this.raza);
    }
    
    void saltar (){
        System.out.println("El tamaño del nuevo perro es: " + this.tamano);
    }

}
