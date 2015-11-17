import java.util.Scanner;

/**
 * Created by james on 11/17/2015.zxcv
 */
public class MonthYearFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a month (1 - 12) : " + scanner);
        int Month = scanner.nextInt();
        System.out.println("Please enter a year (4 digit) : " + scanner);
        int Year = scanner.nextInt();

        MonthDays lost = new MonthDays(Month, Year);
        System.out.println(lost.getNumberOfDays()+ "Days");


    }

}

