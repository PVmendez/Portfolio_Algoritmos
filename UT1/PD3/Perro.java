package Portfolio_Algoritmos.UT1.PD3;

public class Perro implements Mamifero {
    private String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void ladrar() {
        System.err.println("wof");
    }
    public boolean respondeA(String unNombre) {
        return this.nombre.equals(unNombre);
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
