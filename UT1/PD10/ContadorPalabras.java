package Portfolio_Algoritmos.UT1.PD10;

public class ContadorPalabras {
    public static String[] palabrasEnComun(String[] palabras1, String[] palabras2) {
        String[] resultado = new String[palabras1.length + 1];
        int contador = 0;
        for (int i = 0; i < palabras1.length; i++) {
            for (int j = 0; j < palabras2.length; j++) {
                if (palabras1[i].equals(palabras2[j])) {
                    resultado[contador] = palabras1[i];
                    contador++;
                }
            }
        }

        String[] resultadoEspecifico = new String[contador];
        System.arraycopy(resultado, 0, resultadoEspecifico, 0, contador);

        return resultadoEspecifico;
    }
}

// Este código compara cada palabra de dos arrays utilizando bucles anidados.
// Si una palabra en la iteración del primer array coincide con la palabra en la iteración del segundo array,
// se agrega esa palabra a un nuevo array y se incrementa un contador.
// Si no hay coincidencia, no se hace nada y se continúa con la siguiente iteración.
// Al finalizar las iteraciones, se crea un nuevo array con la cantidad exacta de elementos que coincidieron,
// se copian esos elementos al nuevo array y se devuelve este último.

