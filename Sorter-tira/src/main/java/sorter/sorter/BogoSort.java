package sorter.sorter;

import java.util.Random;

/**
 * The class contains methods necessary for a bogosort algorithm
 * @author matti
 */
public class BogoSort {

    /**
     * Method used for sorting an array using quicksort
     * @param a The array to be sorted
     */
    public void sort(int[] a) {
        while (!isSorted(a)) {
            random(a);
        }

    }

    private boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] > a[i]) {
                return false;
            }
        }
        return true;
    }

    private void random(int[] a) {
        Random random = new Random();

        for (int i = a.length - 1; i > 0; i--) {
            swap(a, random.nextInt(i), i);
        }
    }

    private void swap(int[] a, int i, int j) {
        int temp;
        temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
