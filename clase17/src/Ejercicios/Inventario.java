package Ejercicios;

import java.util.HashMap;

public class Inventario {
    private HashMap<String, Integer> productos;

    public Inventario() {
        this.productos = new HashMap<>();
    }

    public void agregarProducto(String nombre, int cantidad) {
        try {
            if (cantidad < 0) {
                throw new CantidadInvalidaException("La cantidad no puede ser negativa.");
            }
            productos.put(nombre, productos.getOrDefault(nombre, 0) + cantidad);
            System.out.println("Producto " + nombre + " agregado con " + cantidad + " unidades.");

        } catch (CantidadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void eliminarProducto(String nombre) throws ProductoNoEncontradoException {
        try {
            if (!productos.containsKey(nombre)) {
                throw new ProductoNoEncontradoException("El producto " + nombre + " no se encuentra en el inventario.");
            }
            productos.remove(nombre);
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void buscarProducto(String nombre) throws ProductoNoEncontradoException {
        try {
            if (!productos.containsKey(nombre)) {
                throw new ProductoNoEncontradoException("El producto " + nombre + " no se encuentra en el inventario.");
            }
            System.out.println("El producto " + nombre + " tiene " + productos.get(nombre) + " unidades.");
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void actualizarProducto(String nombre, int nuevaCantidad) {
        try {
            if (!productos.containsKey(nombre)) {
                throw new ProductoNoEncontradoException("El producto " + nombre + " no se encuentra en el inventario.");
            }
            if (nuevaCantidad < 0) {
                throw new CantidadInvalidaException("La cantidad no puede ser negativa.");
            }
            productos.put(nombre, nuevaCantidad);
            System.out.println("Producto " + nombre + " actualizado con " + nuevaCantidad + " unidades.");
        } catch (ProductoNoEncontradoException | CantidadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
