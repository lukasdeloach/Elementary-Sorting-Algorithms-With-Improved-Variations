/**
 * @author Lukas DeLoach
 * @version 11/18/2022
 * */
public class ImprovedInsertionSort {

    /**
    * Improved Insertion Sort Method - uses eagerly advancing binary search method
    * Improves on comparisons made -  makes nlog(n) Comparisons
    * Makes 0 - n(n-1)/2 Shifts
    * Best Case: Ascending order already sorted ex 1, 2, 3, 4, 5 ...
    * Worst Case: Descending Order ex 5, 4, 3, 2, 1
    * This algorithm always runs in O(n^2) time
    * @param arr
    * @param numOfComp
    * @param numOfSwaps
    * @return an array of integers holding information about the sorting method
    */
    public static int[] improvedInsertionSort(int[] arr, int numOfComp, int numOfSwaps) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int low = 0, high = i;
            while(low < high) {
                int mid = (low+high)>>1;
                numOfComp++;
                if(key<arr[mid]) {
                    high = mid;
                }
                else {
                    low = mid+1;
                }
            }
            for(int j = i; j > low; j--) { //shift
                numOfSwaps++;
                arr[j] = arr[j-1];
            }
            arr[low] = key; //drop
        }
        return new int[] {numOfComp, numOfSwaps};
    }
}
