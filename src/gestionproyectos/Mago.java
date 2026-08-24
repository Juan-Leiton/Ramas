public class Mago {
    private String nombre;
    private int nivel;

    public Mago(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
    }
}