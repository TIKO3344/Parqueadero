package ejemplo1;

public class vehiculo {
    String tipo;
    String marca;
    String modelo;
    int kilometraje;

    public vehiculo(String tipo, String marca, String modelo, int kilometraje) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public void mostrar() {
        System.out.println("Tipo: " + tipo + " | Marca: " + marca + " | Modelo: " + modelo + " | Km: " + kilometraje);
    }
}