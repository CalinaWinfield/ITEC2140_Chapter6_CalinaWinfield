import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
/**Class: Centennial
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: March 21, 2024
 *
 * (#8 in HW)
 * Purpose - write the code necessary to determine if the centennial (1876, at 100 years) is present.
 */

public class Centennial {
    public static void main(String[] args) {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        LocalDate century19 = LocalDate.of(1876, Month.JULY, 4);
        boolean isCentPresent = false;
        
        for(int i = 0;  i < centennials.size(); i++){
            LocalDate date = centennials.get(i);
            if(date.equals(century19)){
                isCentPresent = true;
            }
        }
        System.out.println("centennial present: " + isCentPresent);
    }
}
