import java.util.Calendar;
import java.util.Date;

public class DefensiveCopyTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(2019, Calendar.APRIL, 10);
        Date favoriteDate = calendar.getTime();

        Agency person = new Agency("NASA", favoriteDate);
        favoriteDate.setTime(0);
        System.out.println(person.getFavoriteDate());

    }
}
