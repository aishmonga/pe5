package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

/*
 * Write a program where an array of strings is input and output is a Map<String,boolean> where
 * each different string is a key and its value is true if that string appears 2 or more times in the array.
 */

public class MapStrings {

    /*
     * this function checks for the number of occurrence of a string and returns the required boolean values along with
     * the string in a hash map.
     */

    public Map<String,Boolean> mapperS(String[] S_in){

        Map M_out = new HashMap();

        for(String ss: S_in){
            if(!M_out.containsKey(ss)){
                M_out.put(ss,false);
            }
            else {
                M_out.put(ss,true);
            }
        }
        return M_out;
    }

}
