package sorter.sorter;

/**
 * The class contains methods necessary for a bubble sort algorithm
 * @author matti
 */
public class Bubblesort {

    /**
     * Method used for sorting an array using bubble sort
     * @param a The array to be sorted
     */
    public void sort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    private void swap(int[] a, int i, int j) {
        int temp;
        temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

}
