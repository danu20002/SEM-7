import java.util.Scanner;

public class Termwork9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the current date (mm dd yyyy): ");
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();

        String nextDate = calculateNextDate(month, day, year);
        System.out.println("Next date: " + nextDate);
    }

    public static String calculateNextDate(int month, int day, int year) {
        // Handle invalid dates
        if (!isValidDate(month, day, year)) {
            return "Invalid date";
        }

        // Calculate the next date
        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;

        // Handle end of month
        if (nextDay > getMaxDaysInMonth(month, year)) {
            nextDay = 1;
            nextMonth++;
        }

        // Handle end of year
        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }

        // Format the next date
        return String.format("%02d %02d %04d", nextMonth, nextDay, nextYear);
    }

    private static boolean isValidDate(int month, int day, int year) {
        return (month >= 1 && month <= 12) && (day >= 1 && day <= getMaxDaysInMonth(month, year)) && (year > 0);
    }

    private static int getMaxDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return daysInMonth[month - 1];
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
