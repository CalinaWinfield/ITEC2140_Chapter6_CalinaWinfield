import java.util.HashSet;
/**Class: ArrayIntersect
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: March 21, 2024
 *
 * (#5 in HW)
 * Purpose - Create a new ArrayList named intersection that contains only those items that occur in both lists. If a
 * value is duplicated in either list and it occurs in both lists, it should only occur once in the intersection list.
 */

public class ArrayIntersect {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8, 9, 10};
        int[] list2 = {2, 4, 8, 10, 12, 14, 16, 18, 20};

        HashSet<Integer> intersection = new HashSet<>();

        for(int i = 0; i < list1.length; i++){
            for(int j = 0; j < list2.length; j++){
                if(list1[i] == list2[j] && !intersection.add(list1[i])){
                    intersection.add(list1[i]);
                }
            }
        }
        System.out.println(intersection);
    }
}
