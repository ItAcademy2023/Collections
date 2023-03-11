package com.itacademy.Collections;

public class Student {

    private String name;
    private int age;
    private Grades grade;
    /*Add id to Student class*/
    int id;

    public Student(String name, int age, Grades grade, int id) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Grades getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(Grades grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n" + "Name: " + this.name + " age: " + this.getAge() + " grade: " + this.getGrade() + " id: " + this.getId();
    }

//    @Override
//    public String toString() {
//        return "Name: " + this.name + " id: " + this.getId();
//    }

}
