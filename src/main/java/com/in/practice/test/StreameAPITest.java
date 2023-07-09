package com.in.practice.test;

import com.in.practice.model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class StreameAPITest {

    public static void main(String[] args) {

        //Get the maximum element from the list
        List<Integer> list1 = Arrays.asList(10,3,5,65,34,98);
        int maxElement = list1.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max element from the list:- "+maxElement);
        //Get the second maximum element from the list
        int secondLargestNumberFromList = list1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second Largest Number From List:- "+secondLargestNumberFromList);
        //Get the minimum element from the list
        int minElement = list1.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Minimum element from the list:- "+minElement);



        //Get the Second largest number in an Arrays
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        int secondLargestNumber = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("\nSecond largest number in an Arrays is - " + secondLargestNumber);

        //Remove the null values from the list
        List<String> list2 = Arrays.asList("abc", null, "rddd", null, "gdf");
        System.out.println(list2);
        List<String> list3 = list2.stream().filter(x -> x != null).collect(Collectors.toList());
        list3.forEach(System.out::println);
        //Remove the null values from the Array
        String arr1[] = {"abc", null, "rddd", null, "gdf"};
        System.out.println(Arrays.toString(arr1));
        String arr2[] = Arrays.stream(arr1).filter(i ->  i != null && i.length() > 0).toArray(i -> new String[i]);
        System.out.println(Arrays.toString(arr2));


        List<Employee> employeeList1 = new ArrayList<Employee>(0);

        employeeList1.add(new Employee(101, "Vijay", 23, "Male",10000,1001l, "HR"));
        employeeList1.add(new Employee(102, "Sandhy", 25, "Female",15000,1002l, "IT"));
        employeeList1.add(new Employee(103, "Ramesh", 26, "Male",30000,1001l, "HR"));
        employeeList1.add(new Employee(104, "Geeta", 24, "Female",25000,1001l, "IT"));

        employeeList1.forEach(System.out::println);
        //Get list of employees whose age is greater than equal to 24
        List<Employee> employeeList2 = employeeList1.stream().filter(i -> i.getAge() >= 24).collect(Collectors.toList());
        employeeList2.forEach(System.out::println);

        //calculate the average age of employees
        Map<String, Double> avgAge = employeeList1.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingLong(Employee::getAge)));
        System.out.println(avgAge);

        //calculate the average salary of the employees in the list
        Double averageSalary = employeeList1.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("averageSalary: "+averageSalary);

        ///get distinct department in the list
        List<String> distinctDeptList = employeeList1.stream().map(Employee::getDeprtment).distinct().collect(Collectors.toList()); //forEach(System.out::println);
        distinctDeptList.forEach(System.out::println);

        Map<String, Long> EmployeeCount = employeeList1.stream().collect(Collectors.groupingBy(Employee::getDeprtment, Collectors.counting()));
        System.out.println(EmployeeCount);







        List<String> list4 = Arrays.asList("govind", "aniket", "rddd", "nivedita", "aarohi","hridhaan");
        List<String> list5 = list2.stream().filter(i -> i.startsWith("a")).collect(Collectors.toList());
        //List<String> list3 = list2.stream().map(i -> i.toUpperCase());
       // list3.forEach(System.out::println);
        Integer num1 = 127;
        Integer num2 = 127;

        if(num1==num2){
            System.out.println("num1==num2");
        }else{
            System.out.println("num1!=num2");
        }

//        Integer num1 = 128;
//        Integer num2 = 128;
//
//        if(num1==num2){
//            System.out.println("num1==num2");
//        }else{
//            System.out.println("num1!=num2");
//        }



    }



}
