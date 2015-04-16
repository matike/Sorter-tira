/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorter.sorter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matti
 */
public class BogoSortTest {

    private BogoSort sort;
    private int[] array = {1, 6, 12, 2, 300, 20, 3, 800, 5};
    private ArrayGenerator generator;

    public BogoSortTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.sort = new BogoSort();
        this.generator = new ArrayGenerator(10);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void sortingTest() {
        this.sort.sort(array);
        for (int i = 1; i < array.length; i++) {
            assertTrue(array[i - 1] <= array[i]);
        }

    }

    @Test
    public void sortingTestReverse() {
        this.generator.generateReverse();
        int[] reverseArray = this.generator.getArray();

        this.sort.sort(reverseArray);
        for (int i = 1; i < reverseArray.length; i++) {
            assertTrue(reverseArray[i - 1] <= reverseArray[i]);
        }
    }

    @Test
    public void sortingTestWithTwo() {
        int[] arrayTwo = {7, 2};
        this.sort.sort(arrayTwo);
        assertEquals(2, arrayTwo[0]);
    }

    @Test
    public void sortingAnEmptyArray() {
        int[] arrayEmpty = {};
        this.sort.sort(arrayEmpty);
    }
}
