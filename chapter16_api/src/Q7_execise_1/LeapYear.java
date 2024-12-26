package Q7_execise_1;

import java.time.LocalDate;
import java.util.Calendar;

public class LeapYear {
    public static void main(String[] args) {
        // create calendar
        Calendar cal = Calendar.getInstance();
        cal.set(2000,2,1);
        System.out.println(cal.get(Calendar.YEAR));

        // move to previous day in the calendar
        cal.add(Calendar.DAY_OF_MONTH, -1);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        if(day == 29) {
            System.out.println("leap year");
        }else  {
            System.out.println("not leap year");
        }
        // move to previous year
        cal.clear();
        cal.set(2000, Calendar.JANUARY, 1);
        Calendar nextYear = Calendar.getInstance();
        nextYear.set(2001, Calendar.JANUARY, 1);
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        // 计算两年的天数差
        long millisBetween = nextYear.getTimeInMillis() - cal.getTimeInMillis();
        long daysBetween = millisBetween / (1000 * 60 * 60 * 24); // 将毫秒差转换为天数

        // 输出结果
        System.out.println("Days in year: " + daysBetween);


    //     jdk8
        LocalDate ld = LocalDate.of(2000, 3, 1);
        LocalDate ld2 = ld.minusDays(1);
        System.out.println(ld2);
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);
        System.out.println(ld.isLeapYear());


    }
}
