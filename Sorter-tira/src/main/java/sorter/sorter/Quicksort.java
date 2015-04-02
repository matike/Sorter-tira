package sorter.sorter;

/**
 * The class contains methods necessary for a quicksort algorithm
 * @author matti
 */
public class Quicksort {

    private int partition(int[] a, int left, int right) {
        int pivot = a[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (a[j] <= pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, right);
        return i + 1;

    }

    /**
     * Method used for sorting an array using quicksort
     * @param a The array to be sorted
     * @param left The index where the sorting begins
     * @param right The index where the sorting ends
     */
    public void sort(int[] a, int left, int right) {
        if (left < right) {
            int pivot = partition(a, left, right);
            sort(a, left, pivot - 1);
            sort(a, pivot + 1, right);
        }

    }

    private void swap(int[] a, int i, int j) {
        int temp;
        temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
