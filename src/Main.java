package src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create main class for code to work in VSCode
        SelectionSort sortObj = new SelectionSort();
        int[] arr = {5, 1, 3, 2};
        sortObj.basicSelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
