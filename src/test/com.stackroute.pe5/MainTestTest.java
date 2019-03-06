package com.stackroute.pe5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTestTest {

    MainTest mt;

    @Before
    public void setUp() throws Exception {
        mt = new MainTest();
    }

    @After
    public void tearDown() throws Exception {
        mt = null;
    }

    @Test
    public void studentTester() {

        List<Student> studentList_out = new ArrayList<Student>(){
            {
                add(new Student(1,"farhaan",99));
                add(new Student(2,"farhaan",99));
                add(new Student(3,"farhaan4",99));
                add(new Student(10,"farhaan4",99));
                add(new Student(5,"farhaan2",10));
            }
        };

        List<Student> studentList_in = new ArrayList<Student>(){
            {
                add(new Student(1, "farhaan", 99));
                add(new Student(5, "farhaan2", 10));
                add(new Student(2, "farhaan", 99));
                add(new Student(10, "farhaan4", 99));
                add(new Student(3, "farhaan4", 99));
            }
        };


        assertEquals(studentList_out.toString(),mt.studentTester(studentList_in).toString());
    }
}