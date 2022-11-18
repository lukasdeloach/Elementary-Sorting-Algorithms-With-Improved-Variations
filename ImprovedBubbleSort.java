/**
 * @author Lukas DeLoach
 * @version 11/18/2022
 */
public class ImprovedBubbleSort {

    /**
         * Improved Bubble Sort Method
         * Improves on comparisons and makes from n-1...2n-3...n(n-1)/2 Comparisons
         * Makes 0 - n(n-1)/2 Swaps
         * This algorithm always runs in O(n^2) time
         * Best Case is when collection is already ascendingly sorted
         * Worst Case is when collection is sorted in descending order
         * @param arr
         * @param numOfComp
         * @param numOfSwaps
         * @return an array of integers holding information about the sorting method
         */
    public static int[] improvedBubbleSort(int[] arr, int numOfComp, int numOfSwaps) {

        boolean sorted;
        for(int i = 0; i < arr.length-1; i++) {
            sorted = false;
            for(int j = 0; j < arr.length-i-1; j++) {
                numOfComp++;
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sorted = true;
                    numOfSwaps++;
                }
            }
            if(!sorted) {
                break;
            }
        }
        return new int[] {numOfComp, numOfSwaps};
    }
}
