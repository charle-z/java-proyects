package c2r4.guia;

import java.util.ArrayList;
import java.util.List;

//COPIO DESDE AQUI
public class Lote {

    private List<Producto> productos;

    public Lote() {
        this.productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void mostrarProductos() {
        //CREAR LA ITERACION PARA PODER MOSTRAR LOS PRODUCTOS
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
//HASTA AQUI
