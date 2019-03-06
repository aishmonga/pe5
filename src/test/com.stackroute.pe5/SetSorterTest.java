package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SetSorterTest {

    SetSorter ssms;

    @Before
    public void setUp() throws Exception {
        ssms = new SetSorter();
    }

    @After
    public void tearDown() throws Exception {
        ssms = null;
    }

    @Test
    public void sorte1r() {
        List<String> L_out = new ArrayList<String>(){
            {
                add("apple");
                add("banana");
                add("cat");
                add("dog");
            }
        };

        assertEquals(L_out,ssms.sorter("banana dog apple cat"));

    }

    @Test
    public void sorter() {
        assertEquals(null,ssms.sorter(""));

    }

    @Test
    public void sorte2r() {
        List<String> L_out = new ArrayList<String>(){
            {
                add("apple");
            }
        };

        assertEquals(L_out,ssms.sorter("apple "));

    }

}