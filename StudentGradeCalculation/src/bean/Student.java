package com.mile1.bean;

public class Student {

    private String name;
    private int[] marks;
    private String grade;

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for marks
    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // Getter and Setter for grade
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}