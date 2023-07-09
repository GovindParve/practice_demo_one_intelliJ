package com.in.practice.test;

import com.in.practice.model.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestDemo {

    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(32,53,97,35,43,53,6,295, 32,97);
//        System.out.println(list);

        /*List<Integer> evenList = list.stream().filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println("Even Number List :- "+evenList);

        List<Integer> increametOpp = list.stream().map(i-> i*10).collect(Collectors.toList());
        increametOpp.forEach(System.out::println);

        list.stream().map(s -> s + "").filter(s -> s.startsWith("3")).forEach(System.out::println);

        Set<Integer> set = new HashSet<Integer>();
        list.stream().filter(i -> !set.add(i)).forEach(System.out::println);

        list.stream().findFirst().ifPresent(System.out::println);
        Long count = list.stream().count();
        System.out.println("Count elements:- "+count);
        list.stream().max(Integer::compare).ifPresent(System.out::println);

        int min = list.stream().min(Integer::compareTo).get();
        System.out.println("Min element from list :- "+min);*/

//        List<Integer> evenList1 = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
//        System.out.println("Even numbers from list :- "+evenList1);
//
//        list.stream().filter(i -> i%2 == 0).collect(Collectors.toList()).forEach(System.out::println);
//
//        list.stream().max(Integer::compare).ifPresent(System.out::println);

//        list.stream().map(s -> s +"").filter(s -> s.endsWith("3")).forEach(System.out::println);

//        list.stream().map(i -> i*10).forEach(System.out::println);
//        Set<Integer> set = new HashSet<Integer>();
//        list.stream().filter(i -> !set.add(i)).forEach(System.out::println);


//        String slist1 = slist.stream().map(i-> i.toUpperCase()).collect(Collectors.toList()).toString();
//
//        String slist2 = slist.stream().toString().toUpperCase();


//        List<String> slist1 = Arrays.asList("hcd","cde","yabc","adbc","adbc","bcd");
//
//        List<String> slist2 = slist1.stream().map(s -> s.toUpperCase()).sorted().collect(Collectors.toList());
//        System.out.println(slist2);
//        List<String> slist3 = slist1.stream().sorted().collect(Collectors.toList());
//        System.out.println(slist3);
//        List<String> slist4 = slist1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//        System.out.println(slist4);
//
//
//        List<Employee> employeeList = new ArrayList<Employee>(0);
//
//        employeeList.add(new Employee(101, "Vijay", 23, "Male",1001l, "HR"));
//        employeeList.add(new Employee(102, "Sandhy", 25, "Female",1002l, "IT"));
//        employeeList.add(new Employee(103, "Ramesh", 26, "Male",1002l, "HR"));
//        employeeList.add(new Employee(104, "Geeta", 24, "Female",1001l, "IT"));
//
//
//        List<Employee> employeeList1 = employeeList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
//        employeeList1.forEach(System.out::println);
//
//        String strArr[] = {"fsdf","gdgfd","gdfh","nhyr","vfkd"};
//
//        Stream strArrStream = Stream.of(strArr);
//        strArrStream.forEach(System.out::println);










String str = "goviiind";
char strarr[] = str.toCharArray();
String ch="";
int count = 0;
for(int i= 0; i< strarr.length; i++){
    ch = String.valueOf(strarr[i]);
    //String str2 =
    //System.out.println("Char:- "+ch);
    count = 0;
    for (int j= 0; j< strarr.length; j++){
        if(ch.equals(String.valueOf(strarr[j]))){
            count++;
        }
    }
    //System.out.println("count: "+count);

    //count = 0;

}
        System.out.println("count: "+count);
        if(count > 1){
            System.out.println("Dublicate char:- "+ch +" Count:-"+count);
        }





        int arr[] = {54,98,65,34,90,38};
        int temp =0;
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[4]);










    }
}
