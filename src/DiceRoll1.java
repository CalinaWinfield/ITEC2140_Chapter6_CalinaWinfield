import java.util.Random;
/**Class: DiceRoll1
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: March 21, 2024
 *
 * (#1 in HW)
 * Purpose - Create an integer array named dice1 with a size of 10. Populate each array
 * location with a roll of a six-sided die. Print the array out using an enhanced for loop.
 */


//used source code from ArrayDemo4.java class from March 19's lecture
public class DiceRoll1 {
    public static void main(String[] args) {
        int[] dice1 = new int[10];

        Random random = new Random();

        for(int i = 0; i < dice1.length; i++){
            int roll = (random.nextInt(6)) + 1;
            dice1[i] = roll;
        }
        System.out.print("Dice1: ");
        for(int number : dice1){
            System.out.print(number + " ");
        }
    }
}
