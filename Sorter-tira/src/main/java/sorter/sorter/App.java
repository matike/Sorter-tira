package sorter.sorter;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
// just testing

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sorter sorter = new Sorter();
        long startReal = 0;
        long endReal = 0;
        long startCPU = 0;
        long endCPU = 0;
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();

        while (true) {
            System.out.println("How big an array you want to sort?");
            int size = Integer.parseInt(scanner.nextLine());
            ArrayGenerator generator = new ArrayGenerator(size);
            System.out.println("What is the biggest number you want in the array?");
            int biggest = Integer.parseInt(scanner.nextLine());
            generator.generateArray(biggest);
            System.out.println("Which algorithm do you want to use for sorting(merge sort, quicksort)?");
            String algorithm = scanner.nextLine();
            if (algorithm.equals("merge sort")) {
                startReal = System.nanoTime();
                startCPU = bean.getCurrentThreadCpuTime();
                sorter.mergesort(generator.getArray());
                endCPU = bean.getCurrentThreadCpuTime();
                endReal = System.nanoTime();
                

            } else if (algorithm.equals("quicksort")) {
                startReal = System.nanoTime();
                startCPU = bean.getCurrentThreadCpuTime();
                sorter.quicksort(generator.getArray());
                endCPU = bean.getCurrentThreadCpuTime();
                endReal = System.nanoTime();
            }
            
            System.out.println("Time (real time): " + TimeUnit.NANOSECONDS.toMillis(endReal - startReal) + " milliseconds");
            System.out.println("Time (CPU): " + TimeUnit.NANOSECONDS.toMillis(endCPU - startCPU) + " milliseconds");
            
            break;
        }

    }
}
