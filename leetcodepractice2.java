import java.util.*;

public class leetcodepractice2 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 2, 56, 100, -100 };
        int highest = -99999;
        int lowest = 99999;
        for (int element : arr) {
            if (element > highest) {
                highest = element;
            }
            if (element < lowest) {
                lowest = element;
            }
        }
        int difference = highest - lowest;
        System.out.println("Highest Element: " + highest);
        System.out.println("Lowest Element: " + lowest);
        System.out.println("Difference : " + difference);
    }
}