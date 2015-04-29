package sorter.sorter;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
// just testing

public class App {

    public static void main(String[] args) {
        SorterApp sorterApp = new SorterApp();

        Scanner scanner = new Scanner(System.in);
        long startReal = 0;
        long endReal = 0;
        long startCPU = 0;
        long endCPU = 0;

        ThreadMXBean bean = ManagementFactory.getThreadMXBean();

        while (true) {
            System.out.println("How big of an array do you want to sort? (0 to quit)");
            int size = Integer.parseInt(scanner.nextLine());
            if (size <= 0) {
                break;
            }
            ArrayGenerator gene = new ArrayGenerator(size);
            System.out.println("What kind of an array do you want: random, reversed or sorted");
            String type = scanner.nextLine();
            sorterApp.arrayType(type, gene);
            int[] array = gene.getArray();
            System.out.println("Which algorithm do you want to use? (quicksort, mergesort, heapsort, insertionsort, bubblesort, bogosort)");
            String algorithm = scanner.nextLine();
            
            startReal = System.nanoTime();
            startCPU = bean.getCurrentThreadCpuTime();
            System.out.println("Sorting...");
            sorterApp.sort(array, algorithm);
            endCPU = bean.getCurrentThreadCpuTime();
            endReal = System.nanoTime();
       
            System.out.println("Real time: " + TimeUnit.NANOSECONDS.toMillis(endReal - startReal) + " milliseconds");
            System.out.println("CPU time : " + TimeUnit.NANOSECONDS.toMillis(endCPU - startCPU) + " milliseconds");
            System.out.println("Real time: " + (endReal - startReal) + " nanoseconds");
            System.out.println("CPU time : " + (endCPU - startCPU) + " nanoseconds");
        }
    }
}
