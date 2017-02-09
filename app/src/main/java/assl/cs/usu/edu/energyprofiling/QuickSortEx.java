package assl.cs.usu.edu.energyprofiling;

/**
 * Created by AnilKumar on 2/8/2017.
 */

public class QuickSortEx {
    private int input[];
    private int length;

    public void sort() {

        if (input == null || input.length == 0) {
            return;
        }
        this.input = input;
        length = input.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = input[lowerIndex + (higherIndex - lowerIndex) / 2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (input[i] < pivot) {
                i++;
            }
            while (input[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public QuickSortEx(int maxElemets) {

        int[] input = new int[maxElemets];
        for (int i = 0; i < input.length; i++)
            input[i] = (int) (Math.random() * 100);

    }
}