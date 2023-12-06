
package c2s2.proyectodeclase;


public class RevisionAprendido2Tiquete {
    private String id;
    private double valorUnitario;
    private int cantidadDePasajeros;
    
    RevisionAprendido2Tiquete (String parametroId, double parametroValorUnitario, int cantidadDePasajeros){
        this.id = parametroId;
        this.valorUnitario = parametroValorUnitario;
        this.cantidadDePasajeros = cantidadDePasajeros;
        
    }    
    public double costoTiquete(){
        return this.valorUnitario*this.cantidadDePasajeros;
    }
}
