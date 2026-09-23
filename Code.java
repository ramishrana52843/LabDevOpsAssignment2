import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Code {
    public static void main(String[] args) {
        // 1. Sorting a primitive array
        int[] numbers = {5, 2, 9, 1, 3};
        Arrays.sort(numbers); 
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 5, 9]

        // 2. Sorting an ArrayList
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Apple", "Orange"));
        Collections.sort(fruits);
        System.out.println(fruits); // [Apple, Banana, Orange]

        System.out.println("Hello User This is Just Demo Code : Test for jenkins");

        System.out.println("Name : Ramish Naseer \n  Reg No : SP23-BAI-043");
        
    }
}
