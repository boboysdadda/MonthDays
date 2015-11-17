
/**
 * Created by james on 11/17/2015.
 */
public class MonthDays {
    int month;
    int year;
    int days;


    //test for leap year
    public int getNumberOfDays() {
        if ((year % 100 == 0 && year % 400 == 0 && month == 2) || (year % 100 != 0 && year % 4 == 0 && month == 2))
            days = 29;
        else
            switch (month) {
                case 1:
                    days = 31;
                    break;
                case 2:
                    days = 28;
                    break;
                case 3:
                    days = 31;
                    break;
                case 4:
                    days = 30;
                    break;
                case 5:
                    days = 31;
                    break;
                case 6:
                    days = 30;
                    break;
                case 7:
                    days = 31;
                    break;
                case 8:
                    days = 31;
                    break;
                case 9:
                    days = 30;
                    break;
                case 10:
                    days = 31;
                    break;
                case 11:
                    days = 30;
                    break;
                case 12:
                    days = 31;
                    break;

            }
        return days;

    }

    MonthDays(int m, int y) {
        month = m;
        year = y;

    }

}

