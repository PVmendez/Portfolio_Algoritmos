package Portfolio_Algoritmos.UT1.PD4;

public class IdentifyMyParts {
    public static int x = 7;
    public int y = 3;
}

/*
 * a) La variable de clase es x.
 * b) La variable de instancia es y.
 
    IdentifyMyParts a = new IdentifyMyParts();
    IdentifyMyParts b = new IdentifyMyParts();
    a.y = 5;
    b.y = 6;
    a.x = 1;
    b.x = 2;
    System.out.println("a.y = " + a.y);
    System.out.println("b.y = " + b.y);
    System.out.println("a.x = " + a.x);
    System.out.println("b.x = " + b.x);
    System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);

    Esto dará esta salida:

    a.y = 5
    b.y = 6
    a.x = 2
    b.x = 2
    IdentifyMyParts.x = 2

    Ya que las variables de clase pueden ser accedidas a través de una instancia 
    de la clase y también a través de la propia clase mientras las de instancia
    solo a traves de una instancia de esta.
 */