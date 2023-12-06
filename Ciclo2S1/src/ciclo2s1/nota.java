/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclo2s1;
import java.util.Scanner;


public class nota {
    //ATRIBUTOS
    //CONSTRUCTOR
    //METODOS
}


//Estructura de control en lenguaje Java
class EntradaTexto {
    public static void main(String[] args) {
        String nombre;
        System.out.print("Por favor, dime tu nombre; ");
        nombre = System.console().readLine();
        System.out.println("Hola " + nombre + ", ¡Bienvenido a Java desde cero!");
    }
}

class ObtenerEntradaUsuario
{
    public static void main(String[] args) 
    {
        //Con el uso de Scanner se puede obtener información del usuario
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("Usted ha ingresado a la cadena: "+s);
        
        int a = in.nextInt();
        System.out.println("Usted ha ingresado un enetero: "+a);
        
        float b = in.nextFloat();
        System.out.println("Usted ha ingresado ingresado un float: "+b);
    }//Note que en todos los ejemplos las entradas son almacenadas en variables.
}

class Test {
    public static void main(String[] args) {
        int dia=5;
        String diaString;
        
        //Instrucción switch con tipo de datos int
        switch (dia) {
            case 1:
                //Setencias o instrucciones
                diaString = "Lunes";
                break;
            case 2:
                //Setencias o instrucciones
                diaString = "Martes";
                break;
            case 3:
                //Setencias o instrucciones
                diaString = "Miercoles";
                break;
            case 4:
                //Setencias o instrucciones
                diaString = "Jueves";
                break;
            case 5:
                //Setencias o instrucciones
                diaString = "Viernes";
                break;
            case 6:
                //Setencias o instrucciones
                diaString = "Sábado";
                break;
            case 7:
                //Setencias o instrucciones
                diaString = "Domingo";
                break;
            default:
                diaString = "Día inválido";
                break;
        }
        System.out.println(diaString);
    }
}

//Recorrer un vector
//package Paquete;
class ClaseMain{
        public static void main(String[] args) {
        float[] nota = new float [3];
        nota [0] = 4.5f;
        nota [1] = 3.5f;
        nota [2] = 4.2f;
            for (int i = 0; i < 3; i++) {
                System.out.println("nota[i]");
            }
    }
}