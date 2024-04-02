import java.util.Random;
/**Class: DiceRoll2
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: March 21, 2024
 *
 * (#2 in HW)
 * Purpose - Create an integer array named dice2 with a size of 6. Populate each array
 * location with a roll of a six-sided die. Print the array out using an INDEXED for loop.
 */


//used source code from ArrayDemo4.java class from March 19's lecture, and changed it according to the assignment
public class DiceRoll2{
    public static void main(String[] args){
        int[] dice2 = new int[6];  // changed to 6 to roll 6 numbers

        Random random = new Random();

        for(int i = 0; i < dice2.length; i++){
            int roll = (random.nextInt(6)) + 1;
            dice2[i] = roll;
        }
        System.out.print("Dice2: ");
        for(int i = 0; i < dice2.length; i++){  // changed this line from an enhanced for loop parameter to an indexed for loop parameter
            System.out.print(dice2[i] + " ");
        }
    }
}
