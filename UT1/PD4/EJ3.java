package Portfolio_Algoritmos.UT1.PD4;

public class EJ3 {
    String[] students = new String[10];
    String studentName = "Peter Parker";

    public static void main(String[] args) {
        
    }

    public void exercise() {
        students[0] = studentName;
        studentName = null;
    }
}

/*
 a) 
 - Existen 2 referncias a objetos al terminar la ejecución, el Array students y
 students[0] referencia a un objeto String, mismo que referenciaba studentName. 

 - En este caso no hay candidatos al garbage collector ya que los objetos reservados
 tienen alguna variable los apunte.

 b) El garbage collector se encarga de eliminar de la memoria en la proxima ejecución
 a los objetos que no tienen referencia dentro del codigo, por lo que al quedarse
 innaccesibles son eliminados.
*/