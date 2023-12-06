/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclo2s1;

/**
 *
 * @author carbe
 */
public class tripulante {
    
    //1. DEFINIR LOS ATRIBUTOS
    String nombreTripulante;
    int edadTripulante;
    int codigoTripulante;
    String generoTripulante;
    int estadoMatricula;
    
    //2. CONSTRUCTOR
    //CONSTRUCTOR EXPLICITO
    tripulante(String parametroNombreTripulante, int parametroEdadTripulante, int parametroCodigoTripulante,
            String parametroGeneroTripulante, int parametroEstadoMatricula){
    }
    
    //CONSTRUCTOR IMPLICITO (VACIO)
    tripulante(){
    
    }
    
    //3. METODOS --> ACCIONES DE LA CLASE
    void matricularTripulante(int parametro1){
        int estadoMatricula = parametro1;
        if (estadoMatricula == 0) {
            System.out.println("No estás matriculado.");
        }else{
            System.out.println("Estás matriculado.");
        }
    }
    
    void imprimirListadoTripulanteGrupo(String grupo){
        //ACCION DE IMPRIMIR
    }
}
