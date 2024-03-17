package Portfolio_Algoritmos.UT1.PD6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class TextoT9 {
    private static final String[] letras = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };


    public static void transformarTextoT9(String rutaArchivo) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/salida.txt"));
            String linea;
            HashMap<Character, String> mapa = crearMapaT9();
            while ((linea = reader.readLine()) != null) {
                for (char c : linea.toCharArray()) {
                    if (Character.isLetter(c)) {
                        c = Character.toUpperCase(c);
                        String digitos = mapa.get(c);
                        if (digitos != null) {
                            writer.write(digitos);
                        }
                    } else if (c == ' ') {
                        writer.write("0");
                    } else if (c == '.') {
                        writer.write("1");
                    }
                }
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void transformarT9Texto(String rutaArchivo) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/salida_invertida.txt"));
            String linea;
            while ((linea = reader.readLine()) != null) {
                StringBuilder invertida = new StringBuilder(linea).reverse();
                for (char c : invertida.toString().toCharArray()) {
                    if (Character.isLetter(c)) {
                        c = Character.toUpperCase(c);
                        int codigo = (c - 'A') / 3 + 2;
                        if (c >= 'W') {
                            codigo = 9;
                        } else if (c >= 'T') {
                            codigo = 8;
                        } else if (c >= 'P') {
                            codigo = 7;
                        }
                        writer.write(Integer.toString(codigo));
                    } else if (c == ' ') {
                        writer.write("0");
                    } else if (c == '.') {
                        writer.write("1");
                    }
                }
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static HashMap<Character, String> crearMapaT9() {
        HashMap<Character, String> mapa = new HashMap<>();
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[i].length(); j++) {
                mapa.put(letras[i].charAt(j), Integer.toString(i + 2).repeat(j + 1));
            }
        }
        return mapa;
    } 

    public static int obtenerCodigoT9(char letra) {
        for (int i = 0; i < letras.length; i++) {
            if (letras[i].indexOf(letra) != -1) {
                return i + 2;
            }
        }
        return -1;
    }
}
