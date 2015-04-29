package sorter.sorter;

public class SorterApp {

    private Sorter sorter;
    
    public SorterApp() {
        sorter = new Sorter();
    }

    public void sort(int[] a, String algorithm) {
        if (algorithm.equals("quicksort")) {
            sorter.quicksort(a);
        } else if (algorithm.equals("mergesort")) {
            sorter.mergesort(a);
        } else if (algorithm.equals("heapsort")) {
            sorter.heapsort(a);
        } else if (algorithm.equals("insertionsort")) {
            sorter.insertionSort(a);
        } else if (algorithm.equals("bubblesort")) {
            sorter.bubbleSort(a);
        } else if (algorithm.equals("bogosort")) {
            sorter.bogoSort(a);
        }
    }

    public void arrayType(String type, ArrayGenerator gene) {
        if (type.equals("random")) {
            gene.generateRandom();
        }
        if (type.equals("reversed")) {
            gene.generateReverse();
        }
        if(type.equals("sorted")) {
            gene.generate();
        }

    }
}
