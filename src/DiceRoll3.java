import java.util.ArrayList;
import java.util.Random;
/**Class: DiceRoll3
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: March 21, 2024
 *
 * (#3 in HW)
 * Purpose - Create an ArrayList of Integers named dice3. Generate an Integer representing a roll of a
 * six-sided die 10 times, adding each result to dice3. Print the ArrayList using an enhanced for loop.
 */


//used source code from ArrayListDemo2.java class from March 19's lecture, and changed it according to the assignment
public class DiceRoll3 {
    public static void main(String[] args) {
        ArrayList<Integer> dice3 = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 10; i++){
            int roll = (random.nextInt(6)) + 1;
            dice3.add(roll);
        }
        System.out.print("Dice3: ");
        for(int number : dice3){
            System.out.print(number + " ");
        }
    }
}
