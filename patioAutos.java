package ejemplo1;

public class patioAutos {
    vehiculo[] lista = new vehiculo[50];
    int contador = 0;

    public void agregar(vehiculo v) {
        if (contador < 50) {
            lista[contador] = v;
            contador++;
            System.out.println("Vehiculo registrado con exito.");
        } else {
            System.out.println("El patio esta lleno.");
        }
    }

    public void retirar(int pos) {
        if (pos >= 0 && pos < contador) {
            for (int i = pos; i < contador - 1; i++) {
                lista[i] = lista[i + 1];
            }
            lista[contador - 1] = null;
            contador--;
            System.out.println("Vehiculo retirado.");
        } else {
            System.out.println("Posicion no valida.");
        }
    }

    public void listar() {
        if (contador == 0) {
            System.out.println("No hay vehiculos en el patio.");
        } else {
            System.out.println("--- LISTA DE VEHICULOS ---");
            for (int i = 0; i < contador; i++) {
                System.out.print("[" + i + "] ");
                lista[i].mostrar();
            }
        }
    }
}