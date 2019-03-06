package com.stackroute.pe5;

import java.util.Comparator;

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

public class StudentSorter implements Comparator<Student> {

    /*
     * This is an implementation of the comparator interface
     */

    public int compare(Student a,Student b) {
        if (!(b.getAge() == a.getAge())) {
            return b.getAge() - a.getAge();
        } else if(!(a.getName().equals(b.getName()))) {
            return a.getName().compareTo(a.getName());
        }
        else{
            return a.getId() - b.getId();
        }
    }
}
