package test;

/*
* testSelectionSort.java
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
*/
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.SelectionSort;

public class testSelectionSort {
    private SelectionSort selectionSort;

    @Before
    public void initialize() {
        selectionSort = new SelectionSort();
    }


    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        /** add tests to check for this unit test **/
        assertArrayEquals(Sortedarr, selectionSort.basicSelectionSort(arr));
    }

    public void testNegative(){
        /** Test data contains negative values only **/
        int[] arr = {-10, -1, -6, -2, -7};
        int[] Sortedarr = {-10, -7, -6, -2, -1};

        assertArrayEquals(Sortedarr, selectionSort.basicSelectionSort(arr));

    }

    public void testMixed(){
        /** Test data contains with both positive, negative and zeros **/
    }

    public void testDuplicates(){
        /** Test data contains duplicates **/
    }
}
