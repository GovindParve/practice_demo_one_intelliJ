package com.in.practice.model;

public class Employee {

    private long id;
    private String name;
    private long age;
    private String gender;
    private double salary;
    private Long deptId;
    private String deprtment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeprtment() {
        return deprtment;
    }

    public void setDeprtment(String deprtment) {
        this.deprtment = deprtment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", deptId=" + deptId +
                ", deprtment='" + deprtment + '\'' +
                '}';
    }

    public Employee(long id, String name, long age, String gender, double salary, Long deptId, String deprtment) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.deptId = deptId;
        this.deprtment = deprtment;
    }

    public Employee() {
        super();
    }
}
