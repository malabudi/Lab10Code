package src;
public class SelectionSort {
    private int temp;
    /** Creates a new instance of SelectionSort */

    public SelectionSort() {
    }

    /* A simple SelectionSort algorithm
    * pre-condition: Any arbitrary array is passed in, sorted or not
    * post-condition: A sorted array is returned
    * inputs: Integer array
    * outputs: Sorted integer array
    * special conditions: N/A
    */
    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length; ++i) {
            for (int j= i+1; j < x.length; ++j) {
                    if (x[i] > x[j]) {
                        temp = x[i];
                        x[i] = x[j];
                        x[j] = temp;
                    }
                } // end of inner for loop
            } // end of outer for loop
        return x;
    } // end of basicSelectionSort method
}