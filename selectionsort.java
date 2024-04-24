import java.util.*;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = { 9, 5, 25, 31, 1, -5 };
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int min = 99999;
            int minIndex = 0;
            for (int j = 1; j < size; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Array in Sorted oreder is " + Arrays.toString(arr));
    }

}
