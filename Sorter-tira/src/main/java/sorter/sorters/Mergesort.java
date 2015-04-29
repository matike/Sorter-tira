package sorter.sorters;

/**
 *The class contains methods necessary for a merge sort algorithm
 * @author matti
 */
public class Mergesort {

    private void merge(int[] a, int left, int middle, int right) {
        int n = middle - left + 1;
        int m = right - middle;
        int[] l = new int[n + 1];
        int[] r = new int[m + 1];

        for (int i = 0; i < n; i++) {
            l[i] = a[left + i];
            l[n] = Integer.MAX_VALUE;
        }
        for (int j = 0; j < m; j++) {
            r[j] = a[middle + j + 1];
            r[m] = Integer.MAX_VALUE;
        }
        int i = 0;
        int j = 0;

        for (int k = left; k <= right; k++) {
            if (l[i] <= r[j]) {
                a[k] = l[i];
                i++;
            } else {
                a[k] = r[j];
                j++;
            }
        }

    }

    /**
     * Method used for sorting an array using merge sort
     * @param a The array to be sorted
     * @param left The index where the sorting begins
     * @param right The index where the sorting ends
     */
    public void sort(int[] a, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(a, left, middle);
            sort(a, middle + 1, right);
            merge(a, left, middle, right);

        }
    }
}
