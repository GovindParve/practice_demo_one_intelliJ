package com.in.practice.test;

import com.in.practice.model.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String args[]){


        List<Integer> list1 = Arrays.asList(59, 65, 82, 41, 21, 64,75, 65,41, 21);
        System.out.println("list1 : "+list1);

        int max = list1.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max element from list: "+max);
        int max2 = list1.stream().max(Integer::compare).get();
        System.out.println("Max element from list using second way shortcut : "+max2);
        int min = list1.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min element from the list: "+min);
        Long count = list1.stream().count();
        System.out.println("number of elements count: "+count);

        List<Integer> list2 = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("List sorted in reverse order: "+list2);

        List<Integer> list3 = list1.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("List sorted in natural order: "+list3);

        int secondMax = list1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second max element from the list: "+secondMax);

        List<Integer> list4 = list1.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct elements from the list: "+list4);

        List<Integer> list5 = list1.stream().filter(i -> i%2 != 0).map(i -> i*2).collect(Collectors.toList());
        System.out.println("get odd elements from the list and multiplied by 2 : "+list5);

        int sum = list1.stream().mapToInt(i -> i).sum();
        System.out.println("sum of elements in the list: "+sum);

        StringJoiner sj = new StringJoiner(",");
        sj.add("aaa");
        sj.add("bbb");
        sj.add("cc");
        sj.add("dd");
        System.out.println("StringJoiner sj: "+sj);

        List<String> list6 = list1.stream().map(i -> i + "").filter(i -> i.startsWith("6")).collect(Collectors.toList());
        System.out.println("List of elements starting with 6 from above list: "+list6);

        Set<Integer> set = new HashSet<>();
        List<Integer> list7 = list1.stream().filter(i -> !set.add(i)).collect(Collectors.toList());
        System.out.println("set finding dublicate elements in list: "+list7);

        int arr1[] = {59, 65, 82, 41, 21, 64,75, 65,41, 21};
        int arr2[] = {59, 65, 82, 41, 21, 64,75};
        System.out.println("Cheak contains dublicate elements in list funtion containsDublicate: "+Test.containsDublicate(arr1));
        System.out.println("Cheak contains dublicate elements in list funtion containsDublicate: "+Test.containsDublicate(arr2));

        //System.out.println("Print local date using java 8 : "+ java.time.LocalDate().now());
        //Sort the array and convert it into stream
        int arr3[] = {59, 65, 82, 41, 21, 64,75, 65,41, 21};
        Arrays.parallelSort(arr3);
        Arrays.stream(arr3).forEach(i -> System.out.print(i + " "));

        List<String> list8 = Arrays.asList("govind", "aniket", "rddd", "nivedita", "aarohi","hridhaan");

        List<String> list9 = list8.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.print("List to uppercase: "+list9);





    }
    public static boolean containsDublicate(int arr[]){
        //int arr[] = {59, 65, 82, 41, 21, 64,75, 65,41, 21};
        List<Integer> list8 = Arrays.stream(arr).boxed().collect(Collectors.toList());

        HashSet<Integer> hashSet = new HashSet<>(list8);
        if(list8.size() == hashSet.size()){
            return false;
        } else {
            return true;
        }
    }

}