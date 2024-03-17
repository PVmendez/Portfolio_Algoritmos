package Portfolio_Algoritmos.UT1.PD6;

import java.util.Scanner;

public class LeerEntrada {
    public static void leerEntradaStdin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);

        System.out.println("El área de la circunferencia es: " + area);
        System.out.println("El perímetro de la circunferencia es: " + perimetro);
    }

    public static double calcularArea(double radio) {
        return 3.14f * radio * radio;
    }

    public static double calcularPerimetro(double radio) {
        return 2 * 3.14f * radio;
    }
}
