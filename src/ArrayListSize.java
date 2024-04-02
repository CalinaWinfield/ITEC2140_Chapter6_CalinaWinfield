import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
/**Class: ArrayListSize
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: March 21, 2024
 *
 * (#7 in HW)
 * Purpose - write the code necessary to determine the ArrayList size.
 */

public class ArrayListSize {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        System.out.println("Array size: " + centennials.size());
    }
}
