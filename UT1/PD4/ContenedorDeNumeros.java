package Portfolio_Algoritmos.UT1.PD4;

public class ContenedorDeNumeros {
    public int anInt;
    public float aFloat;

    public static void main(String[] args) {
        ContenedorDeNumeros contenedor = new ContenedorDeNumeros();
        contenedor.aFloat = 3.14f;
        contenedor.anInt = 10;

        System.err.println("anInt: " + contenedor.anInt);
        System.err.println("aFloat: " + contenedor.aFloat);
    }
}
