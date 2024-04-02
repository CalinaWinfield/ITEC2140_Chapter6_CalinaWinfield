import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
/**Class: ArrayCorrection
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: March 21, 2024
 *
 * (#6 in HW)
 * Purpose - Without removing the associated centennials.add(...) source
 * line, write the code to remove the errant entry.
 */

public class ArrayCorrection {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1900, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        System.out.println("Before correction:");
        for (int i = 0; i < centennials.size(); i++) {
            LocalDate date = centennials.get(i);
            // to get the pieces of the date, I looked it up
            System.out.println(date.getMonthValue() + "/" + date.getDayOfMonth() + "/" + date.getYear());
        }
        System.out.println("Array size: " + centennials.size());

        centennials.remove(LocalDate.of(1900, Month.JULY, 4));

        System.out.println("\nAfter correction:");
        for (int i = 0; i < centennials.size(); i++) {
            LocalDate date = centennials.get(i);
            System.out.println(date.getMonthValue() + "/" + date.getDayOfMonth() + "/" + date.getYear());
        }
        System.out.println("Array size: " + centennials.size());
    }
}
