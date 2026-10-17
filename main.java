package ejemplo1;

import java.util.Scanner;// Clase principal donde se ejecuta el programa
public class main {
    // Objeto Scanner estático para leer datos de teclado en cualquier método
    static Scanner sc = new Scanner(System.in);
    
    // Objeto patioAutos estático para almacenar la lista en memoria
    static patioAutos patio = new patioAutos();

    // Punto de inicio de la aplicación
    public static void main(String[] args) {
        menu(); // Llama al menú por primera vez
    }

    // Método recursivo para mostrar las opciones del sistema
    public static void menu() {
        // Muestra las opciones principales
        System.out.println("\n--- MENU PATIO DE AUTOS ---");
        System.out.println("1. Registrar vehiculo");
        System.out.println("2. Dar de baja vehiculo");
        System.out.println("3. Listar vehiculos");
        System.out.println("4. Salir");
        System.out.print("Elija una opcion: ");
        int op = sc.nextInt(); // Lee la opción elegida por el usuario

        // Opción 1: Registrar un nuevo vehículo
        if (op == 1) {
            System.out.println("Seleccione el tipo de vehiculo:");
            System.out.println("1. Auto");
            System.out.println("2. Camioneta");
            System.out.println("3. Moto");
            System.out.print("Opcion: ");
            int t = sc.nextInt();
            
            // Asigna el nombre según el número seleccionado
            String tipo = "";
            if (t == 1) {
                tipo = "Auto";
            }
            if (t == 2) {
                tipo = "Camioneta";
            }
            if (t == 3) {
                tipo = "Moto";
            }

            // Pide el resto de los datos por consola
            System.out.print("Ingrese la marca: ");
            String marca = sc.next();
            System.out.print("Ingrese el modelo: ");
            String modelo = sc.next();
            System.out.print("Ingrese el kilometraje: ");
            int km = sc.nextInt();

            // Crea la instancia de vehículo con los datos leídos
            vehiculo v = new vehiculo(tipo, marca, modelo, km);
            patio.agregar(v); // Lo agrega al patio
            menu(); // Llamada recursiva para volver a mostrar el menú
        } 
        // Opción 2: Dar de baja un vehículo por posición
        else if (op == 2) {
            System.out.print("Ingrese la posicion del vehiculo a retirar: ");
            int pos = sc.nextInt();
            patio.retirar(pos); // Elimina el vehículo del arreglo
            menu(); // Llamada recursiva
        } 
        // Opción 3: Listar todos los vehículos
        else if (op == 3) {
            patio.listar(); // Imprime la lista completa
            menu(); // Llamada recursiva
        } 
        // Opción 4: Condición de salida (caso base de la recursión)
        else if (op == 4) {
            System.out.println("Saliendo del programa...");
            return; // Termina la recursividad y cierra el programa
        } 
        // Opción no valida
        else {
            System.out.println("Opcion incorrecta, intente de nuevo.");
            menu(); // Llamada recursiva para volver a pedir opción
        }
    }
}