import java.util.*;
import java.util.Calendar.*;

public class Datas_Calendar{
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(YEAR, 1989);
        cal.set(MONTH, JANUARY);
        cal.set(DAY_OF_MONTH, 08);

        String[] dias = {"", "Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab"};
        int diaSem = cal.get(DAY_OF_WEEK);
        System.out.println(dias[diaSem]);

    }
}