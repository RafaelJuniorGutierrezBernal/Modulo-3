package Ejercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu de opciones: ");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Buscar producto");
            System.out.println("4. Actualizar producto");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombreAgregar = scanner.nextLine();
                    System.out.println("Ingrese la cantidad del producto: ");
                    int cantidadAgregar = scanner.nextInt();
                    inventario.agregarProducto(nombreAgregar, cantidadAgregar);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    inventario.eliminarProducto(nombreEliminar);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    inventario.buscarProducto(nombreBuscar);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del producto a actualizar: ");
                    String nombreActualizar = scanner.nextLine();
                    System.out.println("Ingrese la nueva cantidad del producto: ");
                    int nuevaCantidad = scanner.nextInt();
                    inventario.actualizarProducto(nombreActualizar, nuevaCantidad);
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }
        scanner.close();
    }
}
