package sorter.sorters;

/**
 * The class contains methods necessary for a heapsort algorithm
 *
 * @author matti
 */
public class Heapsort {

    private int[] heap;
    private int size;

    /**
     * Method used for sorting an array using heapsort
     *
     * @param a The array to be sorted
     */
    public void sort(int[] a) {
        buildHeap(a);
        for (int i = a.length - 1; i > 0; i--) {
            swap(a, 0, i);
            this.size = this.size - 1;
            heapify(a, 0);
        }
    }

    private void heapify(int a[], int i) {
        int left = left(i);
        int right = right(i);
        int largest;

        if (left <= this.size && a[left] > a[i]) {
            largest = left;
        } else {
            largest = i;
        }
        if (right <= this.size && a[right] > a[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(a, i, largest);
            heapify(a, largest);
        }
    }

    private void buildHeap(int[] a) {
        this.size = a.length - 1;
        for (int i = this.size / 2; i >= 0; i--) {
            heapify(a, i);
        }
    }

    private int parent(int i) {
        return i / 2;
    }

    private int left(int i) {
        return 2 * i;
    }

    private int right(int i) {
        return 2 * i + 1;
    }

    private void swap(int[] a, int i, int j) {
        int temp;
        temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

}
