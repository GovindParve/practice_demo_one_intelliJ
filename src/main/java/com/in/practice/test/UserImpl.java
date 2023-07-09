package com.in.practice.test;

import com.in.practice.model.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserImpl {


    public static void main(String[] args) {

        Set<User> users = new HashSet<>();
        User u1 = new User("Parag", "B");
        User u2 = new User("Parag", "B");
        User u3 = new User("Amit", "B");
        User u4 = new User("Amit", "B");
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.forEach(System.out::println);

        Map<Integer,User> users2 = new HashMap<>();
        User users21 = new User("Parag", "A");
        User users22 = new User("Parag", "A");
        User users23 = new User("Amit", "B");
        User users24 = new User("Amit", "B");
        User users25 = new User("Vijay", "c");
        User users26 = new User("Vijay", "A");
        users2.put(101, users21);
        users2.put(101, users22);
        users2.put(103, users23);
        users2.put(103, users24);
        users2.put(104, users25);
        users2.put(104, users26);

        users2.forEach((k,v)->System.out.println("Key: "+k +" Value: "+v));

    }
}
