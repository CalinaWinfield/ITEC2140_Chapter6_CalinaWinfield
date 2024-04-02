import java.util.ArrayList;
import java.util.Random;
/**Class: DiceRoll4
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: March 21, 2024
 *
 * (#4 in HW)
 * Purpose - Create an ArrayList of Integers named dice4. Generate an Integer representing a roll of a
 * six-sided die 5 times, adding each result to dice4. Print the ArrayList using an enhanced for loop.
 */

//used source code from ArrayListDemo2.java class from March 19's lecture, and changed it according to the assignment
public class DiceRoll4 {
    public static void main(String[] args) {
        ArrayList<Integer> dice4 = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 5; i++){
            int roll = (random.nextInt(6)) + 1;
            dice4.add(roll);
        }
        System.out.print("Dice4: ");
        for(int number : dice4){
            System.out.print(number + " ");
        }
    }
}
