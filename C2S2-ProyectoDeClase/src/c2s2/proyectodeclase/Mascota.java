
package c2s2.proyectodeclase;


public class Mascota {
    private String nombre;
    private String raza;
    private String color;
    private String tamano;
    private String propietario;
    private int edad;

    public Mascota(String nombre, String raza, String color, String tamano, String propietario, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.tamano = tamano;
        this.propietario = propietario;
        this.edad = edad;
    }

    

    public Mascota() {
    }
    
    protected void verFichaMascota (){
        System.out.println("TIENDA DE MASCOTAS");
        System.out.println("REGISTRO DE MASCOTAS");
        System.out.println("Nombre de la mascota: "+this.nombre);
        System.out.println("Raza de la mascota: "+this.raza);
        System.out.println("Color de la mascota: "+this.color);
        System.out.println("Tamaño de la mascota: "+this.tamano);
        System.out.println("Propietario de la mascota: "+this.propietario);
        System.out.println("Edad de la mascota: "+this.edad);
    }
    
    
    
    
}
