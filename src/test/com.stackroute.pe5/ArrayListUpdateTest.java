package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayListUpdateTest {

    ArrayListUpdate alu;

    @Before
    public void setUp() throws Exception {
        alu = new ArrayListUpdate();
    }

    @After
    public void tearDown() throws Exception {
        alu = null;
    }

    @Test
    public void arrayListUpdater1() throws IndexOutOfBoundsException {
        ArrayList<String> al_in = new ArrayList<String>() {
            {
                add("apple");
                add("banana");
            }
        };

        ArrayList<String> al_out = new ArrayList<String>() {
            {
                add("cat");
                add("banana");
            }
        };

        assertEquals(al_out,alu.arrayListUpdater("cat",0,al_in) );

        al_in.add("dog");
        al_out.add("dog");

        assertEquals(al_out,alu.arrayListUpdater("cat",0,al_in) );

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void arrayListUpdater2() throws IndexOutOfBoundsException {
        ArrayList<String> al_in = new ArrayList<String>() {
            {
                add("apple");
                add("banana");
            }
        };

        ArrayList<String> al_out = new ArrayList<String>() {
            {
                add("cat");
                add("banana");
            }
        };

        assertEquals(al_out,alu.arrayListUpdater("cat",4,al_in) );

        al_in.add("dog");
        al_out.add("dog");

        assertEquals(al_out,alu.arrayListUpdater("cat",-1,al_in) );

    }





}