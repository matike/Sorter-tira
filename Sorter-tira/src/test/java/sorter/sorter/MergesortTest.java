package sorter.sorter;

import sorter.sorters.Mergesort;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MergesortTest {

    private Mergesort sort;
    private int[] array = {1, 6, 12, 2, 300, 20, 3, 800, 5};
    private ArrayGenerator generator;

    public MergesortTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.sort = new Mergesort();
        this.generator = new ArrayGenerator(10);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void sortingTest() {
        this.sort.sort(array, 0, array.length -1);
        for (int i = 1; i < array.length; i++) {
            assertTrue(array[i - 1] <= array[i]);
        }

    }

    @Test
    public void sortingTestReverse() {
        this.generator.generateReverse();
        int[] reverseArray = this.generator.getArray();

        this.sort.sort(reverseArray, 0, reverseArray.length - 1);
        for (int i = 1; i < reverseArray.length; i++) {
            assertTrue(reverseArray[i - 1] <= reverseArray[i]);
        }
    }

    @Test
    public void sortingTestWithTwo() {
        int[] arrayTwo = {7, 2};
        this.sort.sort(arrayTwo, 0, arrayTwo.length - 1);
        assertEquals(2, arrayTwo[0]);
    }

    @Test
    public void sortingAnEmptyArray() {
        int[] arrayEmpty = {};
        this.sort.sort(arrayEmpty, 0, arrayEmpty.length - 1);
    }
}
