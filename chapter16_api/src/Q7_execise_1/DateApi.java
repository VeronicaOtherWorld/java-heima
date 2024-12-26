package Q7_execise_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;
import java.time.temporal.ChronoUnit;

public class DateApi {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        String dateStr = "1995,01,01";
        // 获取毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd");
        Date date1 = sdf.parse(dateStr);

        System.out.println(date1);

        System.out.println(sdf.format(date));

        // 求差值
        long diffInMillis = date.getTime() - date1.getTime();
        System.out.println(diffInMillis);
        long diffInDays = diffInMillis / (1000 * 60 * 60 * 24);
        System.out.println(diffInDays);

    //     conrunit
        LocalDate now = LocalDate.now();
        LocalDate past = LocalDate.of(1995,1,1);
        long newDay = ChronoUnit.DAYS.between(past, now);
        System.out.println(newDay);


    }
}
