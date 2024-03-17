/*
    public class Zumbido {
    public static void desconcertar (String dirigible) {
    System.out.println (dirigible); [5]
    sipo ("ping", -5); [6]
    }
    public static void sipo (String membrillo, int flag) {
    if (flag < 0) { [2,7]
    System.out.println (membrillo + " sup"); [8]
    } else { 
    System.out.println ("ik"); [3]
    desconcertar (membrillo); [4]
    System.out.println ("muaa-ja-ja-ja"); [9]
    }
    }
    public static void main (String[] args) {
    sipo ("traqueteo", 13); [1]

    a) sipo ("traqueteo", 13);

    Ejecuta la función sipo() pasando por parametros el string "traqueteo" y como entero 13 (correspondientes a membrillo y flag de la función).
    Primero realiza un if en donde su condición es si flag es menor que 0, en caso positivo imprime la variable membrillo seguido de " sup" y en caso contrario imprimiria en varias 
    lineas, la primera seria "ik", la segunda invoca a desconcertar() que imprime lo que le pases por parametro, en este caso la variable membrillo que contiene "traqueteo", 
    la siguiente linea consta de una nueva invoacion de sipo() pasando por parametros "ping" y -5 a lo que se cumpliria su primera condición y unicamente imprimiria "ping sup" por lo
    que continua la ejecución de la primera invocación de sipo() con una ultima impresion "muaa-ja-ja-ja" que quedaria en una cuarta linea.
    }
    }

 */
