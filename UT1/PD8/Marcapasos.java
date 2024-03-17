package Portfolio_Algoritmos.UT1.PD8;

public class Marcapasos {
    private byte presionSanguinea;
    private byte frecuenciaCardiaca;
    private short nivelAzucarSangre;
    private int maximaFuerza;
    private float minTiempoLatidos;
    private float bateriaRestante;
    private String codigoFabricante;

    public Marcapasos(byte presionSanguinea, byte frecuenciaCardiaca, short nivelAzucarSangre, int maximaFuerza,
            float minTiempoLatidos, float bateriaRestante, String codigoFabricante) {
        this.presionSanguinea = presionSanguinea;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.nivelAzucarSangre = nivelAzucarSangre;
        this.maximaFuerza = maximaFuerza;
        this.minTiempoLatidos = minTiempoLatidos;
        this.bateriaRestante = bateriaRestante;
        this.codigoFabricante = codigoFabricante;
    }

    public long calcularConsumoMemoria() {
        long consumo = 0;
        consumo += Byte.BYTES;
        consumo += Byte.BYTES;
        consumo += Short.BYTES;
        consumo += Integer.BYTES;
        consumo += Float.BYTES;
        consumo += Float.BYTES;
        consumo += 8 * Character.BYTES;
        return consumo;
    }

    public void imprimirInformacion() {
        System.out.println("Información del Marcapasos:");
        System.out.println("Presión Sanguínea: " + presionSanguinea);
        System.out.println("Frecuencia Cardíaca: " + frecuenciaCardiaca);
        System.out.println("Nivel de Azúcar en Sangre: " + nivelAzucarSangre);
        System.out.println("Máxima Fuerza Expuesta: " + maximaFuerza);
        System.out.println("Mínimo Tiempo entre Latidos: " + minTiempoLatidos);
        System.out.println("Batería Restante: " + bateriaRestante + "%");
        System.out.println("Código del Fabricante: " + codigoFabricante);
    }

    public static void main(String[] args) {
        Marcapasos marcapasos = new Marcapasos((byte) 120, (byte) 80, (short) 200, 2000000000, 0.5f, 70.5f, "ABC12345");
        marcapasos.imprimirInformacion();
        System.out.println(
                "Memoria consumida por el Marcapasos: " + marcapasos.calcularConsumoMemoria() + " bytes");
    }
}
