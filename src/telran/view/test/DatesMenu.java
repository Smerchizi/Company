package telran.view.test;
import telran.view.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static telran.view.Item.*;
public class DatesMenu {
    public static Item getMenu() {
        Menu menu = new Menu(getItems(), "Dates Operations");
        return menu;
    }

    private static Item[] getItems() {
        Item[] items = {
                of("Date after given days", io -> dateAfter(io)),
                of("Date before given days", io -> dateBefore(io)),
                of("Number days between two dates", io -> daysBetweenDates(io)),
                exit()
        };
        return items;
    }

    private static void daysBetweenDates(InputOutput io) {
        LocalDate date1 = io.readDate("Enter first date in format YYYY-MM-DD","Wrong date format");
        LocalDate date2 = io.readDate("Enter second date in format YYYY-MM-DD","Wrong date format");
        io.writeLine(String.format("Number of days between %s and %s is %d days", date1, date2, ChronoUnit.DAYS.between(date1, date2)));
    }

    private static void dateBefore(InputOutput io) {
        LocalDate date = io.readDate("Enter first date in format YYYY-MM-DD","Wrong date format");
        int days = io.readInt("Enter number of days before the date" + date, "Wrong number of days");
        io.writeLine(String.format("Date before %d days from date %s is %s", days, date, date.minusDays(days)));

    }

    private static void dateAfter(InputOutput io) {
        // TODO Auto-generated method stub
        io.writeLine("TODO - Enter date, enter number days, print date before the days");
    }
}