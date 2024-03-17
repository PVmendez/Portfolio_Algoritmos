package Portfolio_Algoritmos.UT1.PD1;

public class Alumno {
    private String nombre;

    public Alumno() {
        nombre = null;
    }

    public String getNombreAdmiracion() {
        return nombre.concat("!");
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        System.out.println(alumno.getNombreAdmiracion());

        recorrer("gola");
    }

    public static int recorrer(String cadena) {
        int res = 0;
        for (int i = 0; i <= cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }

    public static int getValor() {
        int vector[] = { 6, 16, 26, 36, 46, 56, 66, 76 };
        int idx = 7;
        return vector[idx];
    }

    public static char getPrimerCaracter(String palabra) {
        String string[] = new String[5];
        return (string[1].charAt(1));
    }

    public static String paraAString(int a) {
    Object x1 = new Integer(a);
    return String.valueOf(x1);
    }

    }

/*
 a) El error es que los metodos recorrer, getValor, getPrimerCaracter y paraAString estan definidos fuera de Alumno() por lo que no deberian estar en la clase o
deberian definirse dentro.

b) En recorre() el error se encuentra en el for, ya que si queremos contar correctamente los caracteres deberiamos empezar el contrador desde 0 y no desde 1, ya que si no
nuestro resultado siempre dara uno mas que lo esperado.

c) En getValor() lo que pasa es que estamos intenando acceder a un indice mayor al existente, ya que el array consta de un largo de 8 por lo que su ultimo indice seria 7, si queremos
ver el ultimo valor deberiamos apuntar a este o ver algun otro valor seria de 0 a 6.

d) El problema de getPrimerCaracter() es que crea un array de string de longitud 5 pero no asigna ningun valor a esos 5 elementos, por lo que al intentar acceder al primer caracter
de uno de ellos no podra ya que son nulos.

e) Por ultimo, vemos que en paraAString está intenado castear directamente un objeto integer a un string lo cual no se puede hacer ya que son tipo incompatibles, la mejor forma de 
hacer seria usando valueOf de String que se usa para justamente este objetivo.

 */