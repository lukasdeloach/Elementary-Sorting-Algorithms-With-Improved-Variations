
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
 * Purpose: Honors Data Structure and Algorithms Lab 9 Problem 1
 * Status: Complete and thoroughly tested
 * Last update: 11/15/22
 * Submitted:  11/15/22
 * Comment: test suite and sample run attached
 * Comment: I declare that this is entirely my own work
 * @author: Lukas DeLoach
 * @version: 2022.15.11
 */

public class Driver {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[]args) throws IOException {

        System.out.println("Make your sorting selection now: ");
        System.out.println("1. Bubble Sort.\n2. Improved Bubble Sort. \n3. Selection Sort. \n4. Improved Selection Sort. \n5. Insertion Sort. \n6. Improved Insertion sort.");
        String s = in.readLine().trim();
        int i = convertToInt(s);
        System.out.println(i);

        System.out.println("Enter number of integers: ");
        int num = convertToInt(in.readLine().trim());
        int[] arr = new int[num];
        for(int j = 0; j < num; j++) {
            System.out.println("Enter integer number " + j);
            int value = convertToInt(in.readLine().trim());
            arr[j] = value;
        }
        System.out.println("Input data:");
        System.out.println(toString(arr));
        int numOfComp = 0;
        int numOfSwaps = 0;
        int[] output = new int[2];

        switch(i) {
        case 1:
            output = BubbleSort.bubbleSort(arr, numOfComp, numOfSwaps);
            break;
        case 2:
            output = ImprovedBubbleSort.improvedBubbleSort(arr, numOfComp, numOfSwaps);
            break;
        case 3:
            output = SelectionSort.selectionSort(arr, numOfComp, numOfSwaps);
            break;
        case 4:
            output = ImprovedSelectionSort.improvedSelectionSort(arr, numOfComp, numOfSwaps);
            break;
        case 5:
            output = InsertionSort.insertionSort(arr, numOfComp, numOfSwaps);
            break;
        case 6:
            output = ImprovedInsertionSort.improvedInsertionSort(arr, numOfComp, numOfSwaps);
            break;
        }

        System.out.println("Sorted data");
        System.out.println(toString(arr));
        System.out.println("Number of Comparisons: " + output[0]);
        System.out.println("Number of swaps: " + output[1]);
    }

    public static String toString(int[] arr) {
        StringBuilder str = new StringBuilder();
        for(int num : arr) {
            str.append(num + " ");
        }
        return str.toString();
    }

    /**
     * Method to convert to an integer from a string
     * @param s
     * @return i
     */
    private static int convertToInt(String s) {
        int i = -1;
        try {
            i = Integer.parseInt(s);
        }
        catch(Exception e) {
            System.out.println("Invalid number.");
        }
        return i;
    }

}
