
package c2s2.proyectodeclase;

public class PerroEncapsulamiento {
    
    //1. ATRIBUTOS
    private String raza;
    private String color;
    private String tamano;
    private int edad;
    
    
    //2. CONSTRUCTOR
    public PerroEncapsulamiento(String raza, String color, String tamano, int edad) {
        this.raza = raza;
        this.color = color;
        this.tamano = tamano;
        this.edad = edad;
    }

    public PerroEncapsulamiento(String raza, String tamano) {
        this.raza = raza;
        this.tamano = tamano;
    }
    
    
    
    public PerroEncapsulamiento() {
    }
    
    
    //3. METODOS
    //3.1 METODOS DE ENCAPSULAMIENTO
    //SETTER Y GETTER

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //3.2 METODOS PERSONALIZADOS
    void registrar(){
        System.out.println("La mascota ha sido registrada con los siguientes datos: \n" + "Raza: " + getRaza());
    }

    @Override
    public String toString() {
        return "PerroEncapsulamiento{" + "raza=" + raza + ", color=" + color + ", tamano=" + tamano + ", edad=" + edad + '}';
    }
    
    
    
    
    
}
