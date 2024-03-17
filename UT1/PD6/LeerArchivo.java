package Portfolio_Algoritmos.UT1.PD6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public static void leerEntradaArchivo(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            int enteroLeido = Integer.parseInt(br.readLine());
            double flotanteLeido = Double.parseDouble(br.readLine());
            String cadenaLeida = br.readLine();

            System.out.println("El entero leído es: " + enteroLeido);
            System.out.println("El número de punto flotante es: " + flotanteLeido);
            System.out.println("La cadena leída es \"" + cadenaLeida + "\"");
            System.out.println("¡Hola " + cadenaLeida + "! La suma de " + enteroLeido + " y " + flotanteLeido + " es "
                    + (enteroLeido + flotanteLeido) + ".");
            System.out.println("La división entera de " + flotanteLeido + " y " + enteroLeido + " es "
                    + ((int) (flotanteLeido / enteroLeido)) + " y su resto es " + (flotanteLeido % enteroLeido) + ".");

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error de formato en el archivo: " + e.getMessage());
        }
    }
}
