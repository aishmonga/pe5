package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapNumsTest {

    MapNums mn;

    @Before
    public void setUp() throws Exception {
        mn=new MapNums();
    }

    @After
    public void tearDown() throws Exception {
        mn = null;
    }

    @Test
    public void mapper1() {
        Map<String,Integer> m_in = new HashMap<String,Integer>(){
            {
                put("one",5);
                put("two",2);
                put("three",2);
            }
        };
    assertEquals(m_in,mn.mapper("one one -one___two,,three,one @three*one?two"));
    }

    @Test
    public void mapper2() {
        Map<String,Integer> m_in = new HashMap<String,Integer>(){
            {
                put("one",6);
                put("two",5);
                put("three",4);
            }
        };
        assertEquals(m_in,mn.mapper("onetwo twotwo one -one___two,four three three one,three,one @three*one?two"));
    }


    @Test
    public void mapper3() {
        Map<String,Integer> m_in = new HashMap<String,Integer>(){
            {
                put("one",0);
                put("two",0);
                put("three",0);
            }
        };
        assertEquals(m_in,mn.mapper(""));
    }
}