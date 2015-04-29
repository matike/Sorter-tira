package sorter.sorter;

import sorter.sorters.BogoSort;
import sorter.sorters.Quicksort;
import sorter.sorters.Mergesort;
import sorter.sorters.Heapsort;
import sorter.sorters.InsertionSort;
import sorter.sorters.Bubblesort;

/**
 * The class contains methods for using the different sorting algorithms
 *
 * @author matti
 */
public class Sorter {

    Quicksort quicksort = new Quicksort();
    Mergesort mergesort = new Mergesort();
    Bubblesort bubblesort = new Bubblesort();
    InsertionSort insertion = new InsertionSort();
    BogoSort bogo = new BogoSort();
    Heapsort heap = new Heapsort();

    /**
     * Sort an array using quicksort
     *
     * @param array Array to be sorted
     */
    public void quicksort(int[] array) {
        quicksort.sort(array, 0, array.length - 1);
    }

    /**
     * Sort an array using merge sort
     *
     * @param array Array to be sorted
     */
    public void mergesort(int[] array) {
        mergesort.sort(array, 0, array.length - 1);
    }

    /**
     * Sort an array using bubble sort
     *
     * @param array Array to be sorted
     */
    public void bubbleSort(int[] array) {
        bubblesort.sort(array);
    }

    /**
     * Sort an array using insertion sort
     *
     * @param array Array to be sorted
     */
    public void insertionSort(int[] array) {
        insertion.sort(array);
    }

    /**
     * Sort an array using bogosort
     *
     * @param array Array to be sorted
     */
    public void bogoSort(int[] array) {
        bogo.sort(array);
    }

    /**
     * Sort an array using heapsort
     *
     * @param array Array to be sorted
     */
    public void heapsort(int[] array) {
        heap.sort(array);
    }

}
