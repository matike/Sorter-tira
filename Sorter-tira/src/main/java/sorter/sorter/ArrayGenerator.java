package sorter.sorter;

import static java.lang.Math.random;
import java.util.Random;

/**
 * The class generates an array with desired size and fills it with random
 * numbers
 *
 * @author matti
 */
public class ArrayGenerator {

    Random random;
    int[] array;

    public ArrayGenerator(int size) {
        this.random = new Random();
        this.array = new int[size];
    }

    /**
     * Fills the array with random numbers (from 0-to a specified number)
     *
     * @param biggestNumber The biggest number you want in this array
     */
    public void generateArray(int biggestNumber) {
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = (random.nextInt(100));
        }
    }

    public int[] getArray() {
        return array;
    }

}
