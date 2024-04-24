import java.util.*;

public class leetpractic1 {
    public static void main(String[] args) {
        int[] arr = { 113, 456, 789, 1234 };
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
