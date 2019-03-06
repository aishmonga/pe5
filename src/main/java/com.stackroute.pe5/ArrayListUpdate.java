package com.stackroute.pe5;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 * Write a Java program to update specific array element by given element and empty the array list.
 */

public class ArrayListUpdate {

    /*
     * This function checks and replaces the values
     */

    public ArrayList<String> arrayListUpdater(String S_in, int num_in, ArrayList<String> al_in) throws ArrayIndexOutOfBoundsException{


        ArrayList<String> al_out = al_in;

        al_out.set(num_in,S_in);

        al_in = new ArrayList<String>();
        System.out.println(al_in);

        return al_out;
    }

}
