package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapReplacerTest {

    MapReplacer mr;

    @Before
    public void setUp() throws Exception {
        mr = new MapReplacer();
    }

    @After
    public void tearDown() throws Exception {
        mr = null;
    }

    @Test
    public void replacer1() {
        Map<String,String> M_in = new HashMap<String,String>() {
            {
             put("val1","apple");
             put("val2","banana");
            }
        };

        Map<String,String> M_out = new HashMap<String,String>() {
            {
                put("val1","");
                put("val2","apple");
            }
        };

        assertEquals(M_out,mr.replacer(M_in));
    }

    @Test
    public void replacer2() {
        Map<String,String> M_in = new HashMap<String,String>() {
            {
                put("val1","");
                put("val2","banana");
            }
        };

        Map<String,String> M_out = new HashMap<String,String>() {
            {
                put("val1","");
                put("val2","banana");
            }
        };

        assertEquals(M_out,mr.replacer(M_in));
    }
}