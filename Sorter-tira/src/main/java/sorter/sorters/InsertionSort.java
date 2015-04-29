package sorter.sorters;

/**
 * The class contains an insertion sort algorithm
 * @author matti
 */
public class InsertionSort {

    /**
     * Sort an array using insertion sort
     * @param a The array to be sorted
     */
    public void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int x = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > x) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = x;
        }
    }
}
