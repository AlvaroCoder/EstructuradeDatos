
package ListasEnlazadas;


public class TestListaProductos {
    public static void main(String[] args) {
        ListaProductos lista = new ListaProductos();
        lista.añadirProducto("Zapatillas", 150.00);
        
        lista.insertarProducto("Microfonos", 248.50);
        lista.añadirProducto("Relojes", 98.00);
        
        lista.insertarProducto("Polo", 65.00);
        lista.añadirProducto("Teclado", 248.00);
        
        //Intenta insertando o añadiendo más productos.
        lista.mostrarProductos();
        
        //Eliminamos un producto, en el indice 2.
        lista.eliminarProducto(2);
        
        //Intenta eliminar más productos
        lista.mostrarProductos();
    }
}
