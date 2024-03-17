package Portfolio_Algoritmos.UT1.PD5;

public class ContadorVocales {

    public static void main(String[] args) {
        String frase = "Hello world! test test test.";
        contarVocalesConsonantes(frase);
    }

    public static void contarVocalesConsonantes(String frase) {
        int vocales = 0;
        int consonantes = 0;

        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            TipoEnum tipo = determinarTipoCaracter(c);
            switch (tipo) {
                case VOCAL:
                    vocales++;
                    break;
                case CONSONANTE:
                    consonantes++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);
    }

    private static TipoEnum determinarTipoCaracter(char c) {
        if (c >= 'a' && c <= 'z') {
            for (VocalEnum vocal : VocalEnum.values()) {
                if (c == vocal.toString().toLowerCase().charAt(0)) return TipoEnum.VOCAL;
            }
            return TipoEnum.CONSONANTE;
        } else
            return TipoEnum.OTRO;

    }
}
