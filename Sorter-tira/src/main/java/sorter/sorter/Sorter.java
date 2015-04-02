package sorter.sorter;

/**
 * The class contains methods for using the different sorting algorithms
 * @author matti
 */
public class Sorter {
    Quicksort quicksort = new Quicksort();
    Mergesort mergesort = new Mergesort();
    
    /**
     * Sort an array using quicksort
     * @param array Array to be sorted
     */
    public void quicksort(int[] array) {
        quicksort.sort(array, 0, array.length-1);
    }
    
    /**
     * Sort an array using merge sort
     * @param array Array to be sorted
     */
    public void mergesort(int[] array) {
        mergesort.sort(array, 0, array.length-1);
    }
}
