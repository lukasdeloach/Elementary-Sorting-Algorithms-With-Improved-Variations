
public class SelectionSort {

    /**
    * Selection Sort Method
    * Always makes n(n-1)/2 Comparisons
    * Makes 0 - n-1 Swaps
    * This algorithm always runs in O(n^2) time
    * Best Case when the array is already sorted does no swapps
    * Worst Case when the array is sorted in descending does max comparisons and swaps
    * @param arr
    * @param numOfComp
    * @param numOfSwaps
    * @return an array of integers holding information about the sorting method
    */
    public static int[] selectionSort(int[] arr, int numOfComp, int numOfSwaps) {
        for(int i = arr.length-1; i > 0; i--) {
            int big = 0;
            for(int j = 1; j < i+1; j++) {
                numOfComp++;
                if(arr[j] > arr[big]) {
                    big = j;
                }
            }
            if(big < i) {
                numOfSwaps++;
                int temp = arr[big];
                arr[big] = arr[i];
                arr[i] = temp;
            }
        }
        return new int[] {numOfComp, numOfSwaps};
    }
}
