import java.util.Scanner;

public class CalendarCount {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        
        //call method
        int days = numberOfDaysInMonth(month, year);
        
       //user input
        if (days == 0) {
            System.out.println("Invalid month entered.");
        } else {
            System.out.println("The month " + month + " of year " + year + " has " + days + " days.");
        }
        
        scanner.close();
    }

    // method for number of days in month
    public static int numberOfDaysInMonth(int month, int year) {
        int days = 0;

        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                days = 30;
                break;
            case 2: // February
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = 0; // Invalid month
        }
        
        return days;
    }

    // method for if leap year
    // if year % 4 = 0 AND year % 100 != 0 OR year % 400 == 0
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
