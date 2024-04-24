import java.util.*;

public class leetcodepractice3 {
    public static void main(String[] args) {
        int[] arr = { 9, 5, 25, 531, 1, -5 };
        // for (int i = 0; i < arr.length; i++) {
        // int left = 0;
        // int right = 1;
        // while (right < arr.length) {
        // if (arr[left] > arr[right]) {
        // int temp = arr[left];
        // arr[left] = arr[right];
        // arr[right] = temp;
        // }
        // left++;
        // right++;
        // }
        // }
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);
    }
}
