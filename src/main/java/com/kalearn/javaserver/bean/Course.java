package com.kalearn.javaserver.bean;
/**
 * Course
 */
public class Course {

    private Long id;
    private String name;
    private String description;
    private String credit;
    private String teacherId;

    public Long getId() {
        return id;
    }

    public String getTeacher_id() {
        return teacherId;
    }

    public void setTeacher_id(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}