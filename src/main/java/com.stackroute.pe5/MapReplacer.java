package com.stackroute.pe5;

import java.util.Map;

/*
 * Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
 * Modify and return the given map as follows:
 * a. If the key `val1` has a value, set the key `val2` to have that value, and
 * b. Set the key `val1` to have the value `" "` (empty string).
 */

public class MapReplacer {

    /*
     * this function replaces the values of the keys accordingly
     */

    public Map<String,String> replacer(Map<String,String> M_in){


        if(!M_in.get("val1").equals("")){
            M_in.put("val2",M_in.get("val1"));
            M_in.put("val1","");
        }

        return M_in;
    }

}
