package Portfolio_Algoritmos.UT1.PD3;

public class Gato implements Mamifero {
    private String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void maullar() {
        System.err.println("miau");
    }
    public boolean respondeA(String unNombre) {
        return false;
    }
    public void caminar() {
        System.err.println("*Camina*");
    }
    public void saltar() {
        System.err.println("*Salta*");
    }
    public void correr() {
        System.err.println("*Corre*");
    }
}
