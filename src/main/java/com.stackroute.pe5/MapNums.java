package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

/*
 * Write a program to find the number of counts in the following String. Store the output in
 * Map<String,Integer> as key value pair.
 */

public class MapNums {

    /*
     * This function maps the words to their count
     */

    public Map<String,Integer> mapper(String S_in){

        int num =0;
        Map<String,Integer> m_out= new HashMap<String,Integer>(){
            {
                put("one",0);
                put("two",0);
                put("three",0);
            }
        };

        num = S_in.length() - S_in.replaceAll("one","").length();
        m_out.put("one",num/3);

        num = S_in.length() - S_in.replaceAll("two","").length();
        m_out.put("two",num/3);

        num = S_in.length() - S_in.replaceAll("three","").length();
        m_out.put("three",num/5);

        return m_out;
    }

}
