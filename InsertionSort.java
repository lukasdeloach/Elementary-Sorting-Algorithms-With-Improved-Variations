
public class InsertionSort {

    /**
     * Insertion Sort Method
     * Makes from n-1...n(n-1)/2 Comparisons
     * Does 0...n(n-1)/2 Shifts
     * This algorithm always runs in O(n^2) time
     * Best Case: Ascending order already sorted ex 1, 2, 3, 4, 5 ...
     * Worst Case: Descending Order ex 5, 4, 3, 2, 1
     * @param arr
     * @param numOfComp
     * @param numOfSwaps
     * @returnan array of integers holding information about the sorting method
     */
    public static int[] insertionSort(int[] arr, int numOfComp, int numOfSwaps) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i;
            while(j > 0 && arr[j-1] > key) {
                numOfComp++;
                arr[j] = arr[j-1];
                j--;
                numOfSwaps++;
            }
            arr[j] = key;
        }
        return new int[] {numOfComp, numOfSwaps};
    }
}
