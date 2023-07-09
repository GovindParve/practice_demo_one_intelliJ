package com.in.practice.test;

import java.util.HashMap;

public final class Student  {
    public final String name;
    public final HashMap marks;

    Student(String name, HashMap marks){
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public HashMap getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    /*HashMap map = new HashMap();
        map.put(79,1004);
        Student s = new Student("govind", map);

        map.put(80,1004);

        System.out.println(s.getName());
        System.out.println(s.getMarks());
        System.out.println(s.getMarks().get(79));
        System.out.println(s.getMarks().get(80));*/
}
