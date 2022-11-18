
public class BubbleSort {

    /**
    * Bubble sort method
    * Always makes All Pair Wise Comparisons = n(n-1)2
    * Makes 0 - n(n-1)/2 Swaps
    * This algorithm always runs in O(n^2) time
    * @param arr
    * @param numOfComp
    * @param numOfSwaps
    * @return an array of integers holding information about the sorting method
    */
    public static int[] bubbleSort(int[] arr, int numOfComp, int numOfSwaps) {
        for(int i = 0; i < arr.length-1; i++)
            for(int j = 0; j < arr.length-i-1; j++) {
                numOfComp++;
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    numOfSwaps++;
                }
            }
        return new int[] {numOfComp, numOfSwaps};
    }
}
