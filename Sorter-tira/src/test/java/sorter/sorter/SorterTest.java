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
public class SorterTest {

    private Sorter sorter;
    private int[] quicksortArray = {7, 6, 1000, 16, 8, 502, 150, 122, 300};
    private int[] mergesortArray = {7, 6, 1000, 16, 8, 502, 150, 122, 300};

    public SorterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.sorter = new Sorter();

    }

    @After
    public void tearDown() {
    }

    @Test
    public void quicksortTest() {
        this.sorter.quicksort(quicksortArray);
        for (int i = 1; i < quicksortArray.length; i++) {
            assertTrue(i - 1 < i);
        }
    }

    @Test
    public void mergesortTest() {
        
        for (int i = 1; i < mergesortArray.length; i++) {
            assertTrue(i - 1 < i);
        }
    }

}
