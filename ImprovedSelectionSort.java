/**
 * @author Lukas DeLoach
 * @version 11/18/2022
 * */
public class ImprovedSelectionSort {

    /**
    * Improved Selection Sort Method
    * Sorts both ends at a time
    * Best Case: Ascending order already sorted ex 1, 2, 3, 4, 5 ...
    * Worst Case: Sorted Descending Order
    * Improves on comparisons made makes n-1...2n-3...n(n-1)/2 Comparisons
    * Makes 0 - n-1 Swaps
    * This algorithm is still an O(n^2) time
    * @param arr
    * @param numOfComp
    * @param numOfSwaps
    * @return an array of integers holding information about the sorting method
    */
    public static int[] improvedSelectionSort(int[] arr, int numOfComp, int numOfSwaps) {
        int big, small;
        int k = 0;
        for(int i = arr.length-1; k < i; i--) {
            big = small = k;
            int smallElement = arr[k];

            for(int j = k; j < i+1; j++) {
                if(arr[j] > arr[big]) {
                    numOfComp++;
                    big = j;
                }

                else if(arr[j]< arr[small]) {
                    numOfComp++;
                    small = j;
                    smallElement = arr[j];
                }
            }
            if(big<i) {
                numOfSwaps++;
                int temp = arr[i];
                arr[i] = arr[big];
                arr[big] = temp;
                if(arr[big] == smallElement) {
                    temp = arr[k];
                    arr[k] = arr[big];
                    arr[big] = temp;
                }
                else {
                    numOfSwaps++;
                    temp = arr[k];
                    arr[k] = arr[small];
                    arr[small] = temp;
                }
            }
            k++;
        }
        return new int[] {numOfComp, numOfSwaps};
    }
}
