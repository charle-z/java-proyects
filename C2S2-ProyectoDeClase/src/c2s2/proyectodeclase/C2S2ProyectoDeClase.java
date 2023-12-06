
package c2s2.proyectodeclase;

import java.util.Scanner;

public class C2S2ProyectoDeClase {

    //clase 13 min 29
    
    public static void main(String[] args) {
        
        // CREAMOS-INSTANCIAMOS - CLASE PERRO
        //Y OBTENEMOS LA COMUNICACION CON LA CLASE
        //A TRAVES DEL CONSTRUCTOR
        
        //Clase objetoName = new clase;
//        String parametroRaza="Criollo";
//        Perro cualquierNombre = new Perro(parametroRaza);
        String parametroRaza1="Pitbull";
        String parametroColor1="Negro";
        String parametroTamano1="Mediano";
        int parametroEdad1=5;
        
        double posicionGPS = 0.0;
        float cualquierCosa = 0.0f;
        
        //Clase objeto = new Clase;
        Perro objPerro = new Perro();
        Perro objPerro2 = new Perro(parametroRaza1 = null, parametroColor1, parametroTamano1, parametroEdad1);
        
        objPerro.correr();
        
        objPerro2.registrar();
       
        objPerro2.saltar();
        
        
        //--------------NUEVO EJERCICIO TIENDA------------------//
        String parametroRaza = "";
        String parametroColor = "";
        String parametroTamano = "";
        String parametroNombre = "";
        String parametroPropietario = "";
        int parametroEdad = 0;
        
        System.out.println("----REGISTRO DE MASCOTA----");
        System.out.println("Ingrese la raza de la mascota: ");
        Scanner entrada = new Scanner(System.in);
        parametroRaza = entrada.nextLine();
        
        System.out.println("Ingrese el color de la mascota: ");
        parametroColor = entrada.nextLine();
        System.out.println("Ingrese el tamaño de la mascota: ");
        parametroTamano = entrada.nextLine();
        System.out.println("Ingrese el nombre de la mascota: ");
        parametroNombre = entrada.nextLine();
        System.out.println("Ingrese el propietario de la mascota: ");
        parametroPropietario = entrada.nextLine();
        System.out.println("Ingrese la edad de la mascota: ");
        parametroEdad = entrada.nextInt();
        
        
        Mascota objMascota = new Mascota(parametroNombre, parametroRaza, parametroColor, parametroTamano, parametroPropietario, parametroEdad);
        
        objMascota.verFichaMascota();
        
        //----NUEVO EJERCICIO DE LA TIENDA----
        
        PerroEncapsulamiento objPerroEncapsulado = new PerroEncapsulamiento();
        objPerroEncapsulado.setRaza(parametroRaza);
        objPerroEncapsulado.registrar();
    }
    
}
