package com.sda.dto;

public class StudentDTO {

    private String name;
    private Integer age;
    private Integer averageGrade;

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public Integer getAge () {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public Integer getAverageGrade () {
        return averageGrade;
    }

    public void setAverageGrade ( Integer averageGrade ) {
        this.averageGrade = averageGrade;
    }
}
