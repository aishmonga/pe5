package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Create a Student class that represents the following information of a student: id, name, and age
 * all the member variables should be private .
 * a. Implement `getter and setter` .
 * b. Create a `StudentSorter` class that implements `Comparator interface` .
 * c. Write a class `Maintest` create Student class object(minimum 5)
 * d. Add these student object into a List of type Student .
 * e. Sort the list based on their age in decreasing order, for student having
 * same age, sort based on their name.
 * f. For students having same name and age, sort them according to their ID.
 */

public class MainTest {

    /*
     * This is the function which calls the sorting function
     */

    public List<Student> studentTester(List<Student> StudentList){

        Collections.sort(StudentList, new StudentSorter());

        return (StudentList);

    }
}
