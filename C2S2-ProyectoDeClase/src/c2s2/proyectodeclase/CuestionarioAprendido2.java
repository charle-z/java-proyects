/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2s2.proyectodeclase;


public class CuestionarioAprendido2 {

    //SOLO COPIAR DESDE LA LINEA
    public class RevisionAprendido2Tiquete {

        private String id;
        private double valorUnitario;
        private int cantidadDePasajeros;

        RevisionAprendido2Tiquete(String parametroId, double parametroValorUnitario, int cantidadDePasajeros) {
            this.id = parametroId;
            this.valorUnitario = parametroValorUnitario;
            this.cantidadDePasajeros = cantidadDePasajeros;

        }

        public double costoTiquete() {
            return this.valorUnitario * this.cantidadDePasajeros;
        }
    }
    //HASTA AQUÍ
}
