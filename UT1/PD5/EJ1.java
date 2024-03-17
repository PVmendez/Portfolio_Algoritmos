package Portfolio_Algoritmos.UT1.PD5;

public class EJ1 {
    Day day;
    
    public EJ1(Day day) {
        this.day = day;
    }
    
    public static void main(String[] args) {
        Day[] days = Day.values();
        
        System.out.println("Días de la semana:");
        for (Day day : days) {
            System.out.println(day);
        }
    }
}
