package Portfolio_Algoritmos.UT1.PD3;

public class main {
    public static void main(String[] args) {
        Perro perro = new Perro("Pelusa");
        System.err.println("El perro se llama " + perro.getNombre());
        perro.ladrar();
        System.err.println("Reponde a Pelusa? " + perro.respondeA("Peluso"));

        Gato gato = new Gato("Tommy");
        System.err.println("El gato se llama " + gato.getNombre());
        gato.maullar();
        System.err.println("Reponde a Tommy? " + gato.respondeA("Tommy"));

        perro.caminar();
        perro.saltar();

        gato.correr();
        gato.maullar();
    }
}
