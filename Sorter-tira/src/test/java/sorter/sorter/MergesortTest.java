package sorter.sorter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MergesortTest {

    private Mergesort sort;
    private int[] array = {1, 6, 12, 2, 300, 20, 3, 800, 5};

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
    }

    @After
    public void tearDown() {
    }

    @Test
    public void sortingTest() {
        this.sort.sort(array, 0, array.length - 1);
        for (int i = 1; i < array.length; i++) {
            assertTrue(i - 1 < i);
        }

    }
}