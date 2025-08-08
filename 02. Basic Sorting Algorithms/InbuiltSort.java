import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class InbuiltSort {
    public static void printArray(Integer[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        } System.out.println();
    }
    public static void main(String[] args) {
        // int[] arr = {5, 4, 1, 3, 2};
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);
        
        // Integer[] arr = {5, 4, 1, 3, 2};
        // // Arrays.sort(arr, Collections.reverseOrder());
        // Arrays.sort(arr, 2, 4, Collections.reverseOrder());
        printArray(arr);
    }
}