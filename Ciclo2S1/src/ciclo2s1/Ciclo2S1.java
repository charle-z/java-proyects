/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclo2s1;

import java.util.Scanner;
import javax.xml.transform.OutputKeys;

/**
 *
 * @author carbe
 */
public class Ciclo2S1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String miVariable;
        char miVariable0;
        int miVariable2;
        boolean miVariable3;
        float miVariable4;
        double miVariable5;

        int declaraVariable;

        String ventaTotal;

        String nombre;

        //MENSAJES EN PANTALLA
        //python-->print("Hola mundo")
        System.out.println("Hola mundo");

        //CAPTURA DE DATOS EN PANTALLA
        //python-->input("Ingrese su nombre: ")
        System.out.println("Ingrese su nombre: ");
        Scanner entrada = new Scanner(System.in);
        nombre = entrada.nextLine();
        int edad = 35;
        int sum = 12;

        String mensajeEdad = "La edad del tripulante es: ";

        boolean led = true;
        boolean led2 = true;

        //COMPORTAMIENTO DE IMPRESION DE PANTALLA
        //CTRL + shift + c para comentar todo un bloque
//        System.out.println("El nombre del tripulante es: " + nombre);
//        System.out.println(mensajeEdad + edad);
//        System.out.println(edad + sum);
//        System.out.println(led == led2);
        //CONDICIONALES
        //Python--> if diasemana==1:
        //              print("Lunes")
                //atajo iff tab para tener la estructura del if 
//        if (led2) {
//            
//        }
        //ifelse tab con la estructura del mismo
//        if (led2) {
//            
//        } else {
//        }
        //CONTRUCCION DEL CONDICIONAL IFF
        //DECLARACION DE VARIABLE
        int diaSemana = 1;
        int digitoSemana = 0;
        String semanaTest;
        double calificacion;
        
        System.out.println("Ingrese digito dia semana: ");
        Scanner entradaDia = new Scanner(System.in);
        digitoSemana = entradaDia.nextInt();
        
        //System.out.println("Ingrese su calificación: ");
        Scanner nota = new Scanner(System.in);
        calificacion = nota.nextDouble();

        System.out.println("IMPRIME DIGITO SEMANA: " + digitoSemana);

        //CONSTRUCCION DEL CONDICIONAL IF
        //ATAJO --> iff <tab> o ifelse<tab>
        if (diaSemana == 1) {
            System.out.println("ES LUNES");
        } else if (diaSemana == 2) {
            System.out.println("ES MARTES");
        } else {
            System.out.println("NO ES LUNES NI MARTES");
        }

        //CONSTRUCCION DEL CONDICIONAL - SW + TAB
        
        switch (digitoSemana) {
            case 1:
                System.out.println("ES LUNES");
                break;
            case 2:
                System.out.println("ES MARTES");
                break;
            case 3:
                System.out.println("ES MIERCOLES");
                break;
            case 4:
                System.out.println("ES JUEVES");
                break;
            default:
                System.out.println("ES FIN DE SEMANA");
        }

        
        
        //OPERADORES LOGICOS AND (&&) Y OR (||)
        //Python --> and y or
        if(digitoSemana>=5 && digitoSemana<=7 || digitoSemana != 0){
            System.out.println("OP-Es fin de semana.");
        }
        
        if(digitoSemana != 0 || digitoSemana<=4){
            System.out.println("OP-Es entre semana.");
        }
        
        //OPERADORES LOGICOS BIT A BIT AND (&) Y OR (|)
        int a = 0x0005;
        int b = 0x0007;
        // 0101 & 0111=0101
        System.out.println("a&b = " + (a & b));
        
        //MANEJO DE ARRAYS -- VECTORES
        //Python --> tripulantes ['Juan', 'Martin','Sonia','Martha','Carlos','Miguel','Cristian',8]
        //INICIALIZACION DE VARIABLES
//        int var1 = 0x0005;
//        String tripulantes[] = new String [0];
//        String tripulantes2[] = new String []{"Juan","Martin"};
//        String nombreEstudiante = "";
//        
//        tripulantes[0]="Juan";
//        tripulantes[1]="Martin";
//        tripulantes[2]="Sonia";
//        tripulantes[3]="Martha";
//        tripulantes[4]="Carlos";
//        
//        System.out.println("El ultimo tripulante matriculado es: " + tripulantes[0]);
//        System.out.println("El ultimo tripulante matriculado es: " + tripulantes2[1]);
        
        //ITERACIONES
        //Python --> for i in range (1,10,1):
        //      print(i)
        //ATAJO --> for <tab>
        // for (int i = 0; i < 10; i+1) {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("La posición es: "+i);
        }
        
        //WHILE
        //Python --> i=0
        //while i <= 10:
        //      print(i)
        //      i+=1
        //ATAJO --> while <tab>
        int i=0;
        while (i<=10) {            
            System.out.println("La posición desde el while es: "+i);
            i++;
        }
//        
        //CTRL + SHIFT + TECLA ARRIBA O TECLA ABAJO PARA DUPLICAR UN BLOQUE DE CODIGO
        //CTRL + A PARA SELECCIONAR TODO EL CODIGO
        // ALT + SHIFT + F PARA ORDENAR TODO EL CODIGO
        // TODO code application logic here
    }

}
