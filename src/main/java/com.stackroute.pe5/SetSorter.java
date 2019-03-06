package com.stackroute.pe5;

import java.util.*;

/*Create a Student class that represents the following information of a student: id, name, and age
 * Write a program to implement set interface which sorts the given randomly ordered names in
 * ascending order. Convert the sorted set in to an array list
 * Input : Harry Olive Alice Bluto Eugene
 * Output :
 * Sorted Set : Alice Bluto Eugene Harry Olive
 * Array list from Set : Alice Bluto Eugene Harry Olive
 */


public class SetSorter {

    /*
     * this function sorts the set using tree set
     */

    public List<String> sorter(String S_in){


        Set<String> set1 = new TreeSet<String>();

        if (!S_in.equals("")) {
            for (String ss : S_in.split(" ")) {
                set1.add(ss);
            }

            List<String> L_out = new ArrayList<>();
            L_out.addAll(set1);


            return L_out;
        }
        return null;
    }

}
