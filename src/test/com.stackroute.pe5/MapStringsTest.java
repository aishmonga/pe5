package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapStringsTest {

    MapStrings ms;

    @Before
    public void setUp() throws Exception {
        ms = new MapStrings();
    }

    @After
    public void tearDown() throws Exception {
        ms = null;
    }

    @Test
    public void mapperS1() {
        Map<String,Boolean> M_out = new HashMap<String,Boolean>(){
            {
                put("a",true);
                put("b",false);
                put("c",true);
                put("d",false);
            }
        };

        assertEquals(M_out,ms.mapperS(new String[] {"a","b","c","d","a","c","c"}));

        M_out.put("e",false);
        assertEquals(M_out,ms.mapperS(new String[] {"a","b","c","d","a","c","c","e"}));
    }

    @Test
    public void mapperS2() {
        Map<String,Boolean> M_out = new HashMap<String,Boolean>();

        assertEquals(M_out,ms.mapperS(new String[] {}));

        M_out.put("e",false);
        assertEquals(M_out,ms.mapperS(new String[] {"e"}));
    }
}