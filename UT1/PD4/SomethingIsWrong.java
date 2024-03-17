package Portfolio_Algoritmos.UT1.PD4;

public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle(0, 0);
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }
}

/*
    1) El problema es que Rectangle no es una clase o tipo de Java por lo que no puede
    ser utilizado como tal.
*/